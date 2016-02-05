package freemarker;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.xhtmlrenderer.pdf.ITextRenderer;

import freemarker.enums.EnumDataField;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarkers.document.ColumnData;
import freemarkers.document.ColumnHeader;
import freemarkers.document.RowData;
import freemarkers.document.Table;
import freemarkers.model.Horaire;
import freemarkers.model.Individu;

/**
 * 
 * @author jerem
 *
 */
public class MainFreeMarker {

    final private static String FILE_TEMPLATE = "template/planning.ftl";
    final private static String FILE_OUTPUT = "out/planning.pdf";
    final private static int nbHoraire = 23;// par heure

    public static void main(String[] args) {
	/* Create and adjust the configuration */
	Configuration cfg = new Configuration();
	System.out.println(new File("").getAbsolutePath());
	try {
	    cfg.setDirectoryForTemplateLoading(new File(""));
	    cfg.setObjectWrapper(new DefaultObjectWrapper());
	    Map<String, Object> variables = new HashMap<String, Object>();

	    // populate model
	    List<Individu> individus = buildIndividus();

	    // Build Data
	    Table table = buildHeader(individus);
	    variables.put("individus", individus);
	    variables.put("table", table);

	    // Build HTML
	    Template tp = cfg.getTemplate(FILE_TEMPLATE);
	    StringWriter stringWriter = new StringWriter();
	    BufferedWriter writer = new BufferedWriter(stringWriter);
	    tp.setEncoding("UTF-8");
	    tp.process(variables, writer);
	    String htmlStr = stringWriter.toString();
	    writer.flush();
	    String outputFile = FILE_OUTPUT;
	    writer.close();
	    OutputStream out = new FileOutputStream(outputFile);
	    DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
	    Document doc = builder.parse(new ByteArrayInputStream(htmlStr.getBytes()));

	    // Build PDF
	    ITextRenderer renderer = new ITextRenderer();
	    renderer.setDocument(doc, null);
	    renderer.layout();
	    renderer.createPDF(out);
	    out.close();

	    /* Launch preview PDF */
	    Desktop desk = Desktop.getDesktop();
	    desk.open(new File(FILE_OUTPUT));
	} catch (Exception e) {
	    System.out.print(e.getMessage());
	}
    }

    /**
     * Construite de l'entete du document
     * 
     * @param individus
     * @return
     */
    private static Table buildHeader(List<Individu> individus) {
	Table header = new Table();
	SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd MMMM YYYY");
	String date = sdf.format(new Date());
	String title = "Pointages journaliers du " + date;
	header.setTitle(title);
	header.setHeaderColumns(buildColumnHeaders());
	header.setRowDatas(buildRowDatas(buildColumnHeaders(), individus));
	return header;
    }

    /**
     * Construction de l'entete des colonnes
     * 
     * @return
     */
    private static List<ColumnHeader> buildColumnHeaders() {
	List<ColumnHeader> headerColumns = new ArrayList<ColumnHeader>();
	int i = 0;
	ColumnHeader hColumnRepas = new ColumnHeader(0, EnumDataField.REPAS.getText(), 1, 0);
	headerColumns.add(hColumnRepas);
	while (i <= nbHoraire) {
	    ColumnHeader hColumnHeure = new ColumnHeader(1, utilKeyHoraire(i), 1, i);
	    headerColumns.add(hColumnHeure);
	    i++;
	}
	ColumnHeader hColumnDureePresence = new ColumnHeader(2, EnumDataField.DUREE.getText(), 1, 24);
	headerColumns.add(hColumnDureePresence);
	return headerColumns;
    }

    /**
     * Construction des colonnes
     * 
     * @param columnHeaders
     * @param individu
     * @return
     */
    private static List<ColumnData> buildColumnDatas(List<ColumnHeader> columnHeaders, Individu individu) {
	List<ColumnData> columnDatas = new ArrayList<>();
	Map<String, String> mapData = buildMapData(individu, individu.getHoraires());
	for (ColumnHeader columnHeader : columnHeaders) {
	    String value = (String) mapData.get(columnHeader.getName());
	    int type = columnHeader.getType();
	    int numero = columnHeader.getNumero();
	    ColumnData columnData = new ColumnData(type, value, numero, columnHeader.getShow());
	    columnDatas.add(columnData);
	}
	return columnDatas;
    }

    /**
     * Construction des lignes
     * 
     * @param columnHeaders
     * @param individus
     * @return
     */
    private static List<RowData> buildRowDatas(List<ColumnHeader> columnHeaders, List<Individu> individus) {
	List<RowData> rowDatas = new ArrayList<>();
	for (Individu individu : individus) {
	    RowData rowData = new RowData();
	    rowData.setColumnDatas(buildColumnDatas(buildColumnHeaders(), individu));
	    rowData.setIndividu(individu);
	    rowDatas.add(rowData);
	}
	return rowDatas;
    }

    private static Map<String, String> buildMapData(Individu individu, List<Horaire> horaires) {
	Map<String, String> mapData = new HashMap<>();
	mapData.put(EnumDataField.REPAS.getText(), String.valueOf(individu.getRepas()));
	for (Horaire horaire : horaires) {
	    String isPresent = String.valueOf(horaire.getIsPresent());
	    mapData.put(utilKeyHoraire(horaire.getNumero()), isPresent);
	}
	mapData.put(EnumDataField.DUREE.getText(), String.valueOf(individu.getDureePresence()));
	return mapData;
    }

    /*
     * |Individu| 1 ---- * |Horaire|
     */

    /**
     * Modele de données Individu
     * 
     * @return
     */
    private static List<Individu> buildIndividus() {
	List<Individu> userList = new ArrayList<Individu>();
	List<Horaire> horairesLeo = buildHoraires();
	List<Horaire> horairesAmy = buildHoraires();
	Individu amy = new Individu("RH", "Amy", 28, 0, horairesLeo);
	amy.setRepas(1);
	amy.setDureePresence("3:00");
	Individu leo = new Individu("GRO", "Leo", 23, 1, horairesAmy);
	amy.setRepas(1);
	leo.setDureePresence("6:00");
	userList.add(amy);
	userList.add(leo);
	return userList;
    }

    /**
     * Modele de données Horaire
     * 
     * @return
     */
    private static List<Horaire> buildHoraires() {
	List<Horaire> horaires = new ArrayList<>();
	for (int i = 0; i <= nbHoraire; i++) {
	    int aleatHoraire = (Math.floor(Math.random() * 5) + 1 == 1) ? 1 : 0;
	    Horaire horaire = new Horaire(i, aleatHoraire);
	    horaires.add(horaire);
	}
	return horaires;
    }

    /**
     * Constrtuit la key à partir du numero associé à une horaire
     * 
     * @param horaire
     * @return
     */
    private static String utilKeyHoraire(int horaire) {
	String keyHoraire = String.valueOf(horaire) + EnumDataField.HORAIRE.getText();
	return keyHoraire;
    }
}

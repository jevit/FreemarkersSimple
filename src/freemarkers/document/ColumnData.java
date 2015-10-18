package freemarkers.document;


/**
 * Contenu des colonnes par individus
 * 
 * @author jevit
 *
 */
public class ColumnData {
	/**
	 * Nom affiché de la colonne
	 */
	private String value;
	/**
	 * affiche la colonne si {@code show = 1 }
	 */
	private int show;
	/**
	 * importance de la colonne ( trie ,..)
	 */
	private int numero;
	/**
	 * type de la colonne 0 = repas, 1 = horaire, 2 = durée TODO changer en enum
	 */
	private int type;

	public ColumnData(int type, String value) {
		this.type = type;
		this.value = value;
	}

	public ColumnData(int type, String value, int numero, int show) {
		this(type, value);
		this.numero = numero;
		this.show = show;
	}

	public ColumnData() {

	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getShow() {
		return show;
	}

	public void setShow(int show) {
		this.show = show;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}

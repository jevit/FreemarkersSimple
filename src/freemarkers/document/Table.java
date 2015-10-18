package freemarkers.document;

import java.util.ArrayList;
import java.util.List;

/**
 * Document de type table
 * 
 * @author jevit
 *
 */
public class Table {
	/**
	 * List des colonnes
	 */
	private List<ColumnHeader> headerColumns;
	private List<RowData> rowDatas;
	/**
	 * Titre du document
	 */
	private String title;

	public Table() {
		setHeaderColumns(new ArrayList<>());
		setRowDatas(new ArrayList<>());
	}

	public List<ColumnHeader> getHeaderColumns() {
		return headerColumns;
	}

	public void setHeaderColumns(List<ColumnHeader> headerColumns) {
		this.headerColumns = headerColumns;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<RowData> getRowDatas() {
		return rowDatas;
	}

	public void setRowDatas(List<RowData> rowDatas) {
		this.rowDatas = rowDatas;
	}

}

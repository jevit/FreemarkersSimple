package freemarkers.document;

import java.util.ArrayList;
import java.util.List;

import freemarkers.model.Individu;

/**
 * Une ligne du contenu du table
 * 
 * @author jevit
 *
 */
public class RowData {
	private List<ColumnData> columnDatas;
	private Individu individu;

	public RowData() {
		setColumnDatas(new ArrayList<>());
	}

	public List<ColumnData> getColumnDatas() {
		return columnDatas;
	}

	public void setColumnDatas(List<ColumnData> columnDatas) {
		this.columnDatas = columnDatas;
	}

	public Individu getIndividu() {
		return individu;
	}

	public void setIndividu(Individu individu) {
		this.individu = individu;
	}
}

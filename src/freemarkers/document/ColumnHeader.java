package freemarkers.document;


/**
 * En-tête des colonnes
 * 
 * @author jevit
 *
 */
public class ColumnHeader {
	/**
	 * Nom affiché de la colonne
	 */
	private String name;
	/**
	 * affiche la colonne si {@code show = 1 }
	 */
	private int show;
	/**
	 * importance de la colonne ( trie ,..)
	 */
	private int numero;
	/**
	 * type de la colonne
	 **/
	private int type;

	public ColumnHeader() {
	}

	public ColumnHeader(String name, int show) {
		this();
		this.name = name;
		this.show = show;
	}

	public ColumnHeader(int type, String name, int show, int numero) {
		this(name, show);
		this.numero = numero;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShow() {
		return show;
	}

	public void setShow(int show) {
		this.show = show;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}

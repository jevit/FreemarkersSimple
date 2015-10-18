package freemarkers.model;

/**
 * Une horaire
 * 
 * @author jevit
 *
 */
public class Horaire {
	/**
	 * Individu présent sur cette horaire
	 */
	private int isPresent;
	/**
	 * Numero de colonne. Decoupage tranche horaire . heure -> max = 24/ par
	 * demi-heure -> max = 48
	 */
	private int numero;

	public Horaire(int numero, int isPresent) {
		this.isPresent = isPresent;
		this.numero = numero;
	}

	public int getIsPresent() {
		return isPresent;
	}

	public void setIsPresent(int isPresent) {
		this.isPresent = isPresent;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}

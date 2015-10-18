package freemarkers.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Un individu
 * 
 * @author jevit
 *
 */
public class Individu {
	private String nom;
	private String prenom;
	private int age;
	private int sex;
	private int repas;
	private String horaire = "17:00 à 18:20; 19:00 à 19:20";
	private List<Horaire> horaires;
	private String dureePresence = "";

	/**
	 * Constructor with all fields
	 * 
	 * @param name
	 * @param age
	 * @param sex
	 */
	public Individu(String prenom, String name, int age, int sex, List<Horaire> horaires) {
		super();
		this.prenom = prenom;
		this.nom = name;
		this.age = age;
		this.sex = sex;
		this.horaires = horaires;
	}

	public Individu() {
		setHoraires(new ArrayList<Horaire>());
	}

	// ///////////////////// getter and setter
	// ///////////////////////////////////////////

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getRepas() {
		return repas;
	}

	public void setRepas(int repas) {
		this.repas = repas;
	}

	public int getAge() {
		return age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getHoraire() {
		return horaire;
	}

	public void setHoraire(String horaire) {
		this.horaire = horaire;
	}

	public String getDureePresence() {
		return dureePresence;
	}

	public void setDureePresence(String dureePresence) {
		this.dureePresence = dureePresence;
	}

	public List<Horaire> getHoraires() {
		return horaires;
	}

	public void setHoraires(List<Horaire> horaires) {
		this.horaires = horaires;
	}

}
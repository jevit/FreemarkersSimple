package freemarkerEssai;

public class Person {
	private String name;
	private String prenom;
	private int age;
	private int sex;
	private int repas;
	private String horaire = "17:00 à 18:20; 19:00 à 19:20";
	private int h1;
	private int h2;
	private int h3;
	private int h4;
	private int h5;
	private int h6;
	private int h7;
	private int h8;
	private int h9;
	private int h10;
	private int h11;
	private int h12;
	private int h13;
	private int h14;
	private int h15;
	private int h16;
	private int h17;
	private int h18;
	private int h19;
	private int h20;
	private int h21;
	private int h22;
	private int h23;
	private String dureePresence = "";

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

	public int getH1() {
		return h1;
	}

	public void setH1(int h1) {
		this.h1 = h1;
	}

	public int getH2() {
		return h2;
	}

	public void setH2(int h2) {
		this.h2 = h2;
	}

	public int getH3() {
		return h3;
	}

	public void setH3(int h3) {
		this.h3 = h3;
	}

	public int getH4() {
		return h4;
	}

	public void setH4(int h4) {
		this.h4 = h4;
	}

	public int getH5() {
		return h5;
	}

	public void setH5(int h5) {
		this.h5 = h5;
	}

	public int getH6() {
		return h6;
	}

	public void setH6(int h6) {
		this.h6 = h6;
	}

	public int getH7() {
		return h7;
	}

	public void setH7(int h7) {
		this.h7 = h7;
	}

	public int getH8() {
		return h8;
	}

	public void setH8(int h8) {
		this.h8 = h8;
	}

	public int getH9() {
		return h9;
	}

	public void setH9(int h9) {
		this.h9 = h9;
	}

	public int getH10() {
		return h10;
	}

	public void setH10(int h10) {
		this.h10 = h10;
	}

	public int getH11() {
		return h11;
	}

	public void setH11(int h11) {
		this.h11 = h11;
	}

	public int getH12() {
		return h12;
	}

	public void setH12(int h12) {
		this.h12 = h12;
	}

	public int getH13() {
		return h13;
	}

	public void setH13(int h13) {
		this.h13 = h13;
	}

	public int getH14() {
		return h14;
	}

	public void setH14(int h14) {
		this.h14 = h14;
	}

	public int getH15() {
		return h15;
	}

	public void setH15(int h15) {
		this.h15 = h15;
	}

	public int getH16() {
		return h16;
	}

	public void setH16(int h16) {
		this.h16 = h16;
	}

	public int getH17() {
		return h17;
	}

	public void setH17(int h17) {
		this.h17 = h17;
	}

	public int getH18() {
		return h18;
	}

	public void setH18(int h18) {
		this.h18 = h18;
	}

	public int getH19() {
		return h19;
	}

	public void setH19(int h19) {
		this.h19 = h19;
	}

	public int getH20() {
		return h20;
	}

	public void setH20(int h20) {
		this.h20 = h20;
	}

	public int getH21() {
		return h21;
	}

	public void setH21(int h21) {
		this.h21 = h21;
	}

	public int getH22() {
		return h22;
	}

	public void setH22(int h22) {
		this.h22 = h22;
	}

	public int getH23() {
		return h23;
	}

	public void setH23(int h23) {
		this.h23 = h23;
	}

	/**
	 * Constructor with all fields
	 * 
	 * @param name
	 * @param age
	 * @param sex
	 */
	public Person(String prenom, String name, int age, int sex) {
		super();
		this.prenom = prenom;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	// ///////////////////// getter and setter
	// ///////////////////////////////////////////

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
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

}
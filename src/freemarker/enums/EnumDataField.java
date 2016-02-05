package freemarker.enums;

public enum EnumDataField {
	REPAS("REPAS", "Repas"), HORAIRE("HORAIRE", ""), DUREE("DUREE", "Durée présence");

	private String value;
	private String text;

	EnumDataField(String value, String text) {
		this.value = value;
		this.text = text;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}

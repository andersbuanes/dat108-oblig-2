package no.hvl.dat108.oppgave3;

public enum Kjonn {
	MANN("Mann"),
	KVINNE("Kvinne"),
	TRANS("Trans"),
	TRANSPERSON("Transperson"),
	INTERSEX("Intersex"),
	INTERKJØNN("Interkjønn");
	
	private final String navn;
	
	Kjonn(String navn) {
		this.navn = navn;
	}
	
	public String getNavn() {
		return navn;
	}
}

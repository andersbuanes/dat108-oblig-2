package no.hvl.dat108.oppgave2;

public enum Kjonn {
	MANN("Mann"),
	KVINNE("Kvinne"),
	TRANS("Trans"),
	TRANSPERSON("Transperson"),
	INTERSEX("Intersex"),
	INTERKJ�NN("Interkj�nn");
	
	private final String navn;
	
	Kjonn(String navn) {
		this.navn = navn;
	}
}

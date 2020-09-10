package no.hvl.dat108.oppgave3;

public class Ansatt {
	private String fornavn, etternavn, stilling;
	private Kjonn kjonn;
	private int aarslonn;
	
	public Ansatt(String fnavn, String enavn, String stilling, Kjonn kjonn, int lonn) {
		this.fornavn = fnavn;
		this.etternavn = enavn;
		this.stilling = stilling;
		this.kjonn = kjonn;
		this.aarslonn = lonn;
	}
	
	public String getEtternavn() {
		return etternavn;
	}
	
	public int getLonn() {
		return aarslonn;
	}
	
	public String getStilling() {
		return stilling;
	}
	
	public int setLonn(int nyLonn) {
		aarslonn = nyLonn;
		return aarslonn;
	}
	
	public Kjonn getKjonn() {
		return kjonn;
	}
	
	@Override
	public String toString() {
		return String.format("%d %d - %d - %d", fornavn, etternavn, stilling, kjonn.name());
	}
}

package no.hvl.dat108.oppgave3;

public class Ansatt {
	private String fornavn, etternavn, stilling;
	private Kjonn kjonn;
	private int aarslonn;
	
	/**
	 * 
	 * @param fnavn Fornavnet til den ansatte
	 * @param enavn Etternavnet til den ansatte
	 * @param stilling Den ansattes stilling
	 * @param kjonn Kjonn av den ansatte
	 * @param lonn Ansattes aarslonn
	 */
	public Ansatt(String fnavn, String enavn, String stilling, Kjonn kjonn, int lonn) {
		this.fornavn = fnavn;
		this.etternavn = enavn;
		this.stilling = stilling;
		this.kjonn = kjonn;
		this.aarslonn = lonn;
	}
	
	public String getFornavn() {
		return fornavn;
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
	
	/**
	 * 
	 * @param nyLonn ny aarslonn
	 * @return aarslonn
	 */
	public int setLonn(int nyLonn) {
		aarslonn = nyLonn;
		return aarslonn;
	}
	
	public Kjonn getKjonn() {
		return kjonn;
	}
	
	@Override
	public String toString() {
		return String.format("| %-20s | %-18s | %-7s | %9d |", fornavn + " " + etternavn, stilling, kjonn.getNavn(), aarslonn);
	}
}

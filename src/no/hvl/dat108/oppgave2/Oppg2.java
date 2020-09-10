package no.hvl.dat108.oppgave2;

import java.util.List;
import java.util.function.Function;

public class Oppg2 {

	public static void main(String[] args) {
		
	}
	
	static Function<Ansatt, Integer> kronetillegg = a -> a.setLonn(a.getLonn() + 50000);
	static Function<Ansatt, Integer> prosenttillegg = a -> a.setLonn((int) (a.getLonn() * 1.05));
	static Function<Ansatt, Integer> kronetillegLavLonn = a -> a.getLonn() < 500000 ? kronetillegg.apply(a) : 0;
	static Function<Ansatt, Integer> prosenttilleggHvisMann = a -> a.getKjonn().equals(Kjonn.MANN) ? prosenttillegg.apply(a) : 0;
	
	public static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> f) {
		for (Ansatt a : ansatte) {
			f.apply(a);
		}
	}
	
	public static void skrivUtAlle(List<Ansatt> ansatte) {
		
	}
}

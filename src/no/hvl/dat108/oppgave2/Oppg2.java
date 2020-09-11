package no.hvl.dat108.oppgave2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import no.hvl.dat108.oppgave3.Ansatt;
import no.hvl.dat108.oppgave3.Kjonn;

public class Oppg2 {

	public static void main(String[] args) {
		List<Ansatt> ansatte = new ArrayList<Ansatt>();

		ansatte.add(new Ansatt("Mats", "Ramstad", "Kaptein", Kjonn.MANN, 725000));
		ansatte.add(new Ansatt("Andreas", "Sannesmoen", "Vaktmester", Kjonn.MANN, 1000000));
		ansatte.add(new Ansatt("Matilde", "Knarvik", "Matros", Kjonn.KVINNE, 450000));
		ansatte.add(new Ansatt("Henrik", "Hammer", "Sjef for memes", Kjonn.MANN, 550000));
		ansatte.add(new Ansatt("Andrea", "Sannesmoen", "Sjef for økomoni", Kjonn.KVINNE, 650000));

		skrivUtAlle(ansatte);

		lonnsoppgjor(ansatte, kronetillegg);
		lonnsoppgjor(ansatte, prosenttillegg);
		lonnsoppgjor(ansatte, kronetilleggLavLonn);
		lonnsoppgjor(ansatte, prosenttilleggHvisMann);

		skrivUtAlle(ansatte);
	}

	static Function<Ansatt, Integer> kronetillegg = a -> a.setLonn(a.getLonn() + 50000);
	static Function<Ansatt, Integer> prosenttillegg = a -> a.setLonn((int) (a.getLonn() * 1.05));
	static Function<Ansatt, Integer> kronetilleggLavLonn = a -> a.getLonn() < 500000 ? kronetillegg.apply(a) : 0;
	static Function<Ansatt, Integer> prosenttilleggHvisMann = a -> a.getKjonn().equals(Kjonn.MANN)
																? prosenttillegg.apply(a)
																: 0;

	public static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> f) {
		for (Ansatt a : ansatte)
			f.apply(a);
	}

	public static void skrivUtAlle(List<Ansatt> ansatte) {
		for (Ansatt a : ansatte)
			System.out.println(a.toString());
	}
}

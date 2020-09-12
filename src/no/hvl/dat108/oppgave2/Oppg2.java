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

		Function<Ansatt, Integer> kronetillegg = a -> a.setLonn(a.getLonn() + 50000);
		Function<Ansatt, Integer> prosenttillegg = a -> a.setLonn((int) (a.getLonn() * 1.05));
		Function<Ansatt, Integer> kronetilleggLavLonn = a -> a.getLonn() < 500000 ? kronetillegg.apply(a) : 0;
		Function<Ansatt, Integer> prosenttilleggMann = a -> a.getKjonn().equals(Kjonn.MANN)
																	? prosenttillegg.apply(a)
																	: 0;
		
		skrivUtAlle(ansatte);
		System.out.println();
		
		lonnsoppgjor(ansatte, kronetillegg);
		lonnsoppgjor(ansatte, prosenttillegg);
		lonnsoppgjor(ansatte, kronetilleggLavLonn);
		lonnsoppgjor(ansatte, prosenttilleggMann);

		skrivUtAlle(ansatte);
	}

	public static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> f) {
		ansatte.forEach(a -> f.apply(a));
	}

	public static void skrivUtAlle(List<Ansatt> ansatte) {
		ansatte.forEach(a -> System.out.println(a.toString()));
	}
}

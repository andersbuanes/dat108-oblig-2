package no.hvl.dat108.oppgave3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Oppg3 {

	public static void main(String[] args) {
		
		List<Ansatt> ansatte = new ArrayList<Ansatt>();
		
		ansatte.add(new Ansatt("Mats", "Ramstad", "Kaptein", Kjonn.MANN, 725000));
		ansatte.add(new Ansatt("Andreas", "Sannesmoen", "Vaktmester", Kjonn.MANN, 1000000));
		ansatte.add(new Ansatt("Matilde", "Knarvik", "Matros", Kjonn.KVINNE, 450000));
		ansatte.add(new Ansatt("Henrik", "Hammer", "Sjef for memes", Kjonn.MANN, 550000));
		ansatte.add(new Ansatt("Andrea", "Sannesmoen", "Sjef for økomoni", Kjonn.KVINNE, 650000));
		
		//a
		List<String> etternavn = ansatte.stream().map(a -> a.getEtternavn()).collect(Collectors.toList());
		System.out.println(etternavn.toString());
		System.out.println();
		
		//b
		int antallKvinner = (int) ansatte.stream().filter(a -> a.getKjonn().equals(Kjonn.KVINNE)).count();
		System.out.printf("Antall kvinner: %d\n", antallKvinner);
		System.out.println();
		
		//c
		int lonnKvinner = (int) ansatte.stream().filter(a -> a.getKjonn().equals(Kjonn.KVINNE))
										.mapToInt(a -> a.getLonn()).average().getAsDouble();
		//int lonnKvinner = (int) ansatte.stream().mapToInt(a -> a.getKjonn().equals(Kjonn.KVINNE) ? a.getLonn() : 0).average().getAsDouble();
		System.out.printf("Gjennomsnittslønn hos kvinner: %d\n", lonnKvinner);
		
		//d
		ansatte.stream().filter(a -> a.getStilling().contains("sjef")).forEach(a -> System.out.println(a.toString()));
		System.out.println();
		
		//e
		boolean b = ansatte.stream().anyMatch(a -> a.getLonn() > 800000);
		System.out.printf("Tjener noen mer enn 800 000kr? %b\n", b);
		System.out.println();
		
		//f
		ansatte.stream().forEach(a -> System.out.println(a.toString()));
		System.out.println();
		
		//g
		Ansatt minstLonn = ansatte.stream().min(Comparator.comparing(Ansatt::getLonn)).get();
		System.out.printf("Ansatt med lavest lønn er %s %s\n", minstLonn.getFornavn(), minstLonn.getEtternavn());
		System.out.println();
		
		//h
		int sum = IntStream.range(1, 1000).filter(i -> i % 3 == 0 || i % 5 == 0).sum();
		System.out.printf("Summen av tall i intervallet [1, 1000> som er delelig med 3 eller 5 er %d\n", sum);
	}

}

package no.hvl.dat108.oppgave3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Oppg3 {

	public static void main(String[] args) {
		List<Ansatt> ansatte = Arrays.asList();
		
		//a
		List<String> etternavn = ansatte.stream().map(a -> a.getEtternavn()).collect(Collectors.toList());
		
		//b
		int antallKvinner = (int) ansatte.stream().filter(a -> a.getKjonn().equals(Kjonn.KVINNE)).count();
		
		//c
		int lonnKvinner = (int) ansatte.stream().mapToInt(a -> a.getKjonn().equals(Kjonn.KVINNE) ? a.getLonn() : 0).average().getAsDouble();
		
		//d
		ansatte.stream().filter(a -> a.getStilling().contains("sjef")).forEach(a -> System.out.println(a.toString()));
		
		//e
		boolean b = ansatte.stream().anyMatch(a -> a.getLonn() > 800000);
		
		//f
		ansatte.stream().forEach(a -> System.out.println(a.toString()));
		
		//g
		//List<Ansatt> minstLonn = ansatte.stream().reduce().get();
	
		//h
		int sum = IntStream.range(1, 1000).filter(i -> i % 3 == 0 || i % 5 == 0).sum();
	}

}

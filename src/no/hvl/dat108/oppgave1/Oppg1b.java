package no.hvl.dat108.oppgave1;

import java.util.function.BiFunction;

public class Oppg1b {
	
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> summer = (a, b) -> a + b;
		System.out.printf("Summen av 12 og 13: %d\n", beregn(12, 13, summer));

		BiFunction<Integer, Integer, Integer> storste = (a, b) -> a > b ? a : b;
		System.out.printf("Den største av -5 og 3: %d\n", beregn(-5, 3, storste));
		
		BiFunction<Integer, Integer, Integer> avstand = (a, b) -> a >= b ? a - b : b - a;
		System.out.printf("Avstanden mellom 54 og 45: %d\n", beregn(54, 45, avstand));
	}
	
	/**
	 * 
	 * @param a int
	 * @param b int
	 * @param f BiFunction som skal utføres
	 * @return resultat av BiFunction f
	 */
	public static int beregn(int a, int b, BiFunction<Integer, Integer, Integer> f) {
		return f.apply(a, b);
	}
}

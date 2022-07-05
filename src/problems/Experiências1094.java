package problems;

import java.util.Locale;
import java.util.Scanner;

public class Experiências1094 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		sc.nextLine();
		int r=0,s=0,c=0,totalCobaias=0;
		
		for(int i=0; i<A; i++) {
			int numero = sc.nextInt();
			String tipo = sc.next();

			if(tipo.equals("C")) {
				c += numero;
			} else if(tipo.equals("S")) {
				s += numero;
			} else if(tipo.equals("R")) {
				r += numero;
			}
			totalCobaias=c+r+s;
		}
		double percentualCoelho=(c*100.00)/totalCobaias;
		double percentualRato=(r*100.00)/totalCobaias;
		double percentualSapo=(s*100.00)/totalCobaias;
		
		System.out.printf("Total: %d cobaias%n", totalCobaias);
		System.out.printf("Total de coelhos: %d%n", c);
		System.out.printf("Total de ratos: %d%n", r);
		System.out.printf("Total de sapos: %d%n", s);
		System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelho);
		System.out.printf("Percentual de ratos: %.2f %%%n", percentualRato);
		System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapo);
		
	}

}

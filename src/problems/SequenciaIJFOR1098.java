package problems;

import java.util.Locale;
import java.util.Scanner;

public class SequenciaIJFOR1098 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		double i = 0,j=1;
		int cont=0;
		while(j<=3) {
			System.out.printf("I=%d J=%d%n", (int)i,(int)j++);
		}
		double lastJ = 1.2;
		for(i = 0.2 , j = 1.2; i<=2; ) {
			System.out.printf("I=%.1f J=%.1f%n", i,j);
			cont++;
			j++;
			if(cont==3) {
				i += 0.2;
				j = lastJ + 0.2;
				cont=0;
				lastJ = j;
			}
			if(i>1.8) {
				
			}
		}
	
	}
} 



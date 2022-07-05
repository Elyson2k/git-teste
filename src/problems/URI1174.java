package problems;

import java.util.Locale;
import java.util.Scanner;

public class URI1174 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] lista = new double[100];
		double guardarNumeros = 0;
		for(int i = 0; i<5; i++) {
			lista[i] = sc.nextDouble();
		}
		for(int i=0; i<5; i++) {
			if(lista[i]<=10) {
				System.out.printf("A[%d] = %.1f%n", i,lista[i]);
			}
		}

	}

}

package problems;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class NumerosPositivos1060 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double[] numeros = new double[6];
		int cont=0;
		for(int i=0; i<6; i++) {
			numeros[i] = sc.nextDouble();
			if(numeros[i]>0) {
				cont++;
			}
		}
		System.out.println(cont + " valores positivos");
	}

}

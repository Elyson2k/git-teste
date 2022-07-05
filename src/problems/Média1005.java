package problems;

import java.util.Locale;
import java.util.Scanner;

public class Média1005 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble()
;		double soma = (2*A + 3*B + 5*C) / 10;
		System.out.printf("MEDIA = %.1f", soma);
	}

}

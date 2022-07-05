package problems;

import java.util.Locale;
import java.util.Scanner;

public class URI1178 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double[] vetor = new double[100];
		vetor[0] = x;
		for(int i=1; i<vetor.length ; i++) {
			vetor[i] = vetor[i -1 ] / 2.0000;
		}
		for(int i=0; i<vetor.length ; i++) {
			System.out.printf("N[%d] = %.4f%n", i,vetor[i]);
		}
	}

}

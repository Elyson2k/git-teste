package problems;

import java.util.Locale;
import java.util.Scanner;

public class CoordenadasDeUmPonto1041 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		double X = sc.nextDouble();
		double Y = sc.nextDouble();
		if(X>0 && Y>0) {
			System.out.printf("Q1");
		}
		if(X<0 && Y<0) {
			System.out.printf("Q3");
		}
		if(X<0 && Y>0) {
			System.out.print("Q2");
		}
		if(X>0 && Y<0) {
			System.out.println("Q4");
		}
		if(X==0 && Y==0) {
			System.out.printf("Origem");
		}
		if(X==0 && ( Y>0 || Y<0 ) ) {
			System.out.printf("Eixo Y");
		}
		if(Y==0 && ( X>0 || X<0 ) ) {
			System.out.printf("Eixo X");
		}
	}

}

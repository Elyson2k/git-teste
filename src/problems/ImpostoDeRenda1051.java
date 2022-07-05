package problems;

import java.util.Locale;
import java.util.Scanner;

public class ImpostoDeRenda1051 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		double porc;
		double X = sc.nextDouble();
		if(X>=0 && X<=2000.00) {
			System.out.printf("Isento%n");
		} 
		if(X>2000 && X<=3000.00) {
			porc =  (X-2000)*0.8;
			System.out.printf("R$ %.2f%n", porc);
		}
		if(X>3000 && X<=4500.00) {
			porc = (X-3000) * 0.18 + (1000 * 0.08);
			System.out.printf("R$ %.2f%n", porc);
		}
		if(X>4500.00) {
			porc = ((X-4500.00)*0.28)+(1500.00*0.18)+(1000*0.08);
			System.out.printf("R$ %.2f%n", porc);
		}
		sc.close();
	}

}

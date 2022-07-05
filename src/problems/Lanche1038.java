package problems;

import java.util.Locale;
import java.util.Scanner;

public class Lanche1038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int A = sc.nextInt();
		int B = sc.nextInt();
		switch(A) {
			case 1:
				System.out.printf("Total: R$ %.2f%n", B*4.0);
				break;
			case 2:
				System.out.printf("Total: R$ %.2f%n", B*4.50);
				break;
			case 3:
				System.out.printf("Total: R$ %.2f%n", B*5.00);
				break;
			case 4:
				System.out.printf("Total: R$ %.2f%n", B*2.00);
				break;
			case 5:
				System.out.printf("Total: R$ %.2f%n", B*1.50);
				break;
			default:
				break;
		}

	}

}

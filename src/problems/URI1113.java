package problems;

import java.util.Locale;
import java.util.Scanner;

public class URI1113 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		while(true) {
			x = sc.nextInt();
			y = sc.nextInt();
			if(x==y)break;
			if(x>y) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}
		}

	}

}








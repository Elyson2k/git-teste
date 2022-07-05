package problems;

import java.util.Locale;
import java.util.Scanner;

public class Mjölnir1865 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		String nome = " ";
		int fc;
		for(int i=0; i<C; i++) {
			nome = sc.next();
			fc = sc.nextInt();
			if(nome.equals("Thor")) {
				System.out.printf("Y%n");
			} else {
				System.out.printf("N%n");
			}
		}
		
	}

}

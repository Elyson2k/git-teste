package problems;

import java.util.Locale;
import java.util.Scanner;

public class Maior1013 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a + " eh o maior");
		} else if(b > c) {
			System.out.println(b + " eh o maior");
		} else {
			System.out.println(c + " eh o maior");
		}
	}

}

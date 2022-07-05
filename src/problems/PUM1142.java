package problems;

import java.util.Locale;
import java.util.Scanner;

public class PUM1142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int x = sc.nextInt();
		
		for(int i=1,cont=1; i<=x; i++, cont+=4) {
			System.out.printf("%d %d %d PUM%n", cont , cont + 1, cont + 2);
		}

	}

}

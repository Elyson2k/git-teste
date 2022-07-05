package problems;

import java.util.Locale;
import java.util.Scanner;

public class URI1173 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] lista = new int[10];
		for(int i=0; i<lista.length; i++) {
			lista[i] = x;
			System.out.printf("N[%d] = %d%n", i, lista[i]);
			x*=2;
		}

	}

}

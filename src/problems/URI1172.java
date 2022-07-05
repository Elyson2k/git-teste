package problems;

import java.util.Locale;
import java.util.Scanner;

public class URI1172 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int[] lista = new int[10];
		for (int i = 0; i < 10; i++) {
			lista[i] = sc.nextInt();
		}
		for(int i=0; i<10; i++) {
			if(lista[i]<=0) {
				lista[i]=1;
			}
			System.out.printf("X[%d] = %d", i, lista[i]);
		}
	}

}

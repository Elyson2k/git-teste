package problems;

import java.util.Locale;
import java.util.Scanner;

public class Idades1154 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] vetorN = new int[1000];
		for(int i=0; i<1000; i++) {
			vetorN[i]= i % T;
			System.out.printf("N[%d] = %d\n",i, vetorN[i]);
		}
		
	}
}

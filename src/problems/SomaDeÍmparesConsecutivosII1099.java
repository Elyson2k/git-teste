package problems;

import java.util.Locale;
import java.util.Scanner;

public class SomaDeÍmparesConsecutivosII1099 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int maior=0, menor=0;
		int soma=0;
		for(int i=0; i<N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x>y) {
				maior = x;
				menor = y; 
			} else {
				maior = y;
				menor = x;
			}
			soma=0;
			for( menor=menor+1; menor< maior; menor++) {
				if(menor%2!=0) {
					soma+=menor;
				}
			}
			System.out.printf("%d%n", soma);
		}
		
	}
		
}


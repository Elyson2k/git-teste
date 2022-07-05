package problems;

import java.util.Locale;
import java.util.Scanner;

public class SomaDeImparesConsectuvosI1071 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int maior=0, menor=0;
		int soma=0;
		if(X>Y) {
			maior = X;
			menor = Y;
		} else {
			maior = Y;
			menor = Y;
		}
		for(menor = menor + 1; menor<maior; menor++) {
			if(menor%2!=0) {
				soma+=menor;
			}
		}
		System.out.println(soma);
	}

}

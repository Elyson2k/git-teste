package problems;

import java.util.Locale;
import java.util.Scanner;

public class PositivosMédia1064 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N,contPos=0,soma=0,media;
		for(int i=0; i<6; i++) {
			N = sc.nextDouble();
			if(N>0) {
				contPos++;
				soma+=N;
			}
		}
		media = soma / 6;
		System.out.printf("%.0f valores positivos%n%.1f", contPos, media);
	}
}

package problems;

import java.util.Locale;
import java.util.Scanner;

public class MaiorePosição1180 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		int maior=0;
		int N;
		int posMaior=0;
		for(int i=0; i<5; i++) {
			N = sc.nextInt();
			if(N>maior) {
				maior=N;
				posMaior=i;
			}
		}
		System.out.printf("%d\n%d\n", maior, posMaior);
	}

}

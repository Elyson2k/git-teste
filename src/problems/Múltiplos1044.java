package problems;

import java.util.Locale;
import java.util.Scanner;

public class Múltiplos1044 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int maior=0,menor;
		if(X>Y) {
			maior=X;
			menor=Y;
		}else {
			maior=Y;
			menor=X;
		}
		if(maior%menor==0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
	}

}

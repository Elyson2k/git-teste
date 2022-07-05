package problems;

import java.util.Locale;
import java.util.Scanner;

public class SequenciaIJTHREE1097 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		int I = 1;
		int J = 60;
		while(I<=37) {
			System.out.printf("I=%d J=%d%n", I,J--);
			I+=3;
			J-=4;
		}

	}

}

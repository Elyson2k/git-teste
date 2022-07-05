package problems;

import java.util.Locale;
import java.util.Scanner;

public class NúmerosPositivos1060 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double X;
		int contPos=0;
		for(int i=0; i<6; i++) {
			X = sc.nextDouble();
			if(X>0) {
				contPos++;
			}
		}
		System.out.printf("%d valores positivos", contPos);

	}

}

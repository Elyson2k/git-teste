package problems;

import java.util.Locale;
import java.util.Scanner;

public class URI1116 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		for(int i=0; i<A; i++) {
			double X = sc.nextDouble();
			double Y = sc.nextDouble();
			if(X>0 && Y>0 || Y<0) {
				System.out.println(X/Y);
			} else if(X==0) {
				System.out.println("0.0");
			} else if(Y==0) {
				System.out.println("divisao impossivel");
			}
		}

	}

}

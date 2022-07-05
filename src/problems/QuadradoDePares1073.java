package problems;

import java.util.Locale;
import java.util.Scanner;

public class QuadradoDePares1073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int X = sc.nextInt();
		for(int i=1; i<=X; i++) {
			if(i%2==0) {
				System.out.printf("%d^2=%d%n", i,(i*i));
			}
		}	
	}

}

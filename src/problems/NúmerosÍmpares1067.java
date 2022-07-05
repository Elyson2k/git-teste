package problems;

import java.util.Locale;
import java.util.Scanner;

public class NúmerosÍmpares1067 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int impares;
		for(int i=1; i<=numero ; i++) {
			if(i%2==1){
				System.out.printf("%d%n", i);
			}
		}
		
	}

}

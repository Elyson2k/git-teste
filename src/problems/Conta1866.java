package problems;

import java.util.Locale;
import java.util.Scanner;

public class Conta1866 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		for(int i=0; i<A; i++) {
			int daVez = sc.nextInt();
			if(daVez%2==1) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}

	}

}
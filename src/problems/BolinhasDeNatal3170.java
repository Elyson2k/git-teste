package problems;

import java.util.Locale;
import java.util.Scanner;

public class BolinhasDeNatal3170 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>=(b/2)) {
			System.out.println("Amelia tem todas bolinhas!");
		} else {
			int bolinhas = (b/2)-a;
			System.out.println("Faltam " + bolinhas + " bolinha(s)");
		}
		

	}

}

package problems;

import java.util.Locale;
import java.util.Scanner;

public class URI1044 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=1; i<=x; i++) {
			System.out.printf("%d %d %d%n", i , i*i , i*i*i);
			System.out.printf("%d %d %d%n", i , (i*i)+1 , (i*i*i)+1);
		}
	}

}

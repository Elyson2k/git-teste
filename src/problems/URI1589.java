package problems;

import java.util.Scanner;

public class URI1589 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int soma=0;
		
		for (int i = 0; i < x; i++) {
			int r1 = sc.nextInt();
			int r2 = sc.nextInt();
			soma=r1+r2;
			System.out.println(soma);
		}
	}

}

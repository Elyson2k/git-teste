package problems;

import java.util.Scanner;

public class URI1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for (int i = 0; i < x; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			int soma = 0;
			for (int i1 = a, total = 0; total < b; i1++) {
				if (i1 % 2 != 0) {
					soma += i1;
					total += 1;
				}
			}
			System.out.println(soma);

		}

	}

}
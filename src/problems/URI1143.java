package problems;

import java.util.Scanner;

public class URI1143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			System.out.printf("%d %d %d%n", i, i*i, i*i*i);

		}

	}

}

package problems;

import java.util.Scanner;

public class URI1759 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			if (i == x - 1) {
				System.out.println("Ho!");
			} else {
				System.out.printf("Ho ");
			}
		}

	}

}

package problems;

import java.util.Scanner;

public class URI1847 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		for (int i = 0; i < 1; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			if (A > B && B <= C) {
				System.out.println(":)");
				break;
			}
			if (A < B) {
				if (B <= C) {
					System.out.println(":(");
					break;
				}
			}
			if (A < B) {
				if (B < C) {
					if ((B - A) > (C - B)) {
						System.out.println(":(");
						break;
					}
				}
			}
			if (A < B) {
				if (B < C) {
					if ((B - A) > (C - B)) {
						System.out.println(":)");
						break;
					}
				}
			}
			if(A==B) {
				if(C>=B) {
					System.out.println(":)");
				}
			}
			if(A==B) {
				if(C<=B) {
					System.out.println(":(");
				}
			}
		}
	}

}

package problems;

import java.util.Scanner;

public class URI2483 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.printf("Feliz nat");
		for(int i = 0; i < n; i++) {
			if(i==n-1) {
				System.out.println("al");
			} else {
				System.out.printf("a");
			}
		}
		

	}

}

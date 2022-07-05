package problems;

import java.util.Scanner;

public class URI1165 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 1; i <=x; i++) {
			int a = sc.nextInt();
			if(a%2==0) {
				System.out.println("Nao primo");
			} else {
				System.out.println("Primo");
			}
		}
	}

}

package problems;

import java.util.Scanner;

public class URI2059 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
    	int j1 = sc.nextInt();
    	int j2 = sc.nextInt();
    	int r = sc.nextInt();
    	int a = sc.nextInt();
    	
    	if (r == 1 && a == 0) {
    		System.out.println("Jogador 1 ganha!");
    	} else if (r == 0 && a == 1) {
    		 System.out.println("Jogador 1 ganha!");
    	} else if (r == 1 && a == 1) {
    		System.out.println("Jogador 2 ganha!");
    	} else if (p == 0 && (j1 + j2) % 2 != 0) {
    		System.out.println("Jogador 1 ganha!");
    	} else if (p == 1 && (j1 + j2) % 2 == 0) {
    		System.out.println("Jogador 1 ganha!");
    	} else {
    		System.out.println("Jogador 2 ganha!");
    	}

	}

}

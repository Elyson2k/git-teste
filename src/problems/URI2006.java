package problems;

import java.util.Scanner;

public class URI2006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] lista = new int[5];
		int quantostem = 0;
		for (int i = 0; i < 5; i++) {
			lista[i] = sc.nextInt();
			if(lista[i] == x) quantostem++;
		}
		System.out.println(quantostem);

	}

}

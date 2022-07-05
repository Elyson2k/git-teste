package problems;

import java.util.Scanner;

public class URI1789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int x = sc.nextInt();
			int maior=0;
			int[] lesmasNivel = new int[x];
			for (int i = 0; i < x; i++) {
				lesmasNivel[i] = sc.nextInt();
				if(lesmasNivel[i]>maior) {
					maior=lesmasNivel[i];
				}
			}
			if(maior<10) {
				System.out.println("1");
			} else if(maior>=10 && maior<20) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}
		}
	}

}
package problems;

import java.util.Scanner;

public class URI1564 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int x = sc.nextInt();
			if(x==0) {
				System.out.println("vai ter copa!");
			} else {
				System.out.println("vai ter duas!");
			}
		}

	}

}

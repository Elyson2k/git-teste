package problems;

import java.util.Scanner;

public class URI1145 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y;
		while(true) {
			y = sc.nextInt();
			if(y==0) break;
			for(int i=1; i<y; i++) {
				System.out.printf("%d ", i);
				if(i==y-1) {
					System.out.println(y);
				}
			}
		}

	}

}

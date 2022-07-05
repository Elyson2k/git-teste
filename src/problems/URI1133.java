package problems;

import java.util.Scanner;

public class URI1133 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			for( int i=b+1 ; i<a; i++) {
				if(i%5==2 || i%5==3) {
					System.out.println(i);
				}
			}
		} else if(b>a) {
			for( int i=a+1 ; i<b; i++) {
				if(i%5==2 || i%5==3) {
					System.out.println(i);
				}
			}
		}
	}

}

package problems;

import java.util.Scanner;

public class URI1132 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int soma=0;
		if(a>b) {
			for( int i=b ; i<=a; i++) {
				if(i%13!=0) {
					soma+=i;
				}
			}
		} else {
			for( int i=a ; i<=b; i++) {
				if(i%13!=0) {
					soma+=i;
				}
			}
		}
		System.out.println(soma);

	}

}

package problems;

import java.util.Scanner;

public class URI2060 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int multiplo2=0;
		int multiplo3=0;
		int multiplo4=0;
		int multiplo5=0;
		for(int i = 0; i<x ; i++) {
			int daVez = sc.nextInt();
			if(daVez%2==0) {
				multiplo2++;
			}
			if(daVez%3==0) {
				multiplo3++;
			}
			if(daVez%4==0) {
				multiplo4++;
			}
			if(daVez%5==0) {
				multiplo5++;
			}
		}
		System.out.println(multiplo2 + " Multiplo(s) de 2");
		System.out.println(multiplo3 + " Multiplo(s) de 3");
		System.out.println(multiplo4 + " Multiplo(s) de 4");
		System.out.println(multiplo5 + " Multiplo(s) de 5");
	}

}

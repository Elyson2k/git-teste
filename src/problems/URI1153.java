package problems;

import java.util.Scanner;

public class URI1153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fatorial=sc.nextInt();
		int i=1;
		for( ; fatorial>=1; fatorial--) {
			i*=fatorial;	
		}
		System.out.println(i);
	}

}

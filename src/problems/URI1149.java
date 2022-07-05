package problems;

import java.util.Scanner;

public class URI1149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int soma = 0;
		x = sc.nextInt();
		while(true) {
			y = sc.nextInt();
			if(y>0) break;
		}
		for(int i=0; i<y; i++) {
			soma+=x+i;
		}
			
		System.out.println(soma);

	}
}

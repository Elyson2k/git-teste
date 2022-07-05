package problems;

import java.util.Scanner;

public class URI1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int a=0,g=0,d=0;
		while(true) {
			x = sc.nextInt();
			if(x==4) {
				System.out.println("MUITO OBRIGADO");
				System.out.printf("Alcool: %d%n", a);
				System.out.println("Gasolina: "+ g);
				System.out.println("Diesil: "+ d);
				break;
			}
			if(x==1) {
				a++;
			} else if(x==2) {
				g++;
			} else if(x==3) {
				d++;
			}

		}

	}

}

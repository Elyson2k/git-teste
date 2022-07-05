package problems;

import java.util.Locale;
import java.util.Scanner;

public class DeQueméaVez1914 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault (Locale.US); 
		int A = sc.nextInt();
		sc.nextLine();
		String nome1,op1,nome2,op2;
		int n1,n2;
		int soma;
		for(int i=0; i<A; i++) {
			String entrada = sc.nextLine();
			String[] l = entrada.split(" ");
			nome1 = l[0];
			op1 = l[1];
			nome2 = l[2];
			op2 = l[3];
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			sc.nextLine();
			if((n1 + n2) % 2 == 0) {
				if(op1.equals("PAR")) {
					System.out.println(nome1);
	           	} else {
	           		System.out.println(nome2);
	           	}
	        } else {
	        	if(op1.equals("IMPAR")) {
	        		System.out.println(nome1);
	        	} else {
	        	   System.out.println(nome2);
	        	}
	        }
		}

	}

}

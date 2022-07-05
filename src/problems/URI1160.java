package problems;

import java.util.Locale;
import java.util.Scanner;

public class URI1160 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int pessoasCidadeA;
		int pessoasCidadeB;
		double anosCidadeA;
		double anosCidadeB;
		
		int taxaCA=0;
		int taxaCB=0;
		
		for(int i=0; i<T; i++) {
			int cont=0;
			pessoasCidadeA = sc.nextInt();
			pessoasCidadeB = sc.nextInt();
			anosCidadeA = sc.nextDouble();
			anosCidadeB = sc.nextDouble();
			
			
			
			for( ; pessoasCidadeA<=pessoasCidadeB; ) {
				taxaCA= (int) ((pessoasCidadeA*anosCidadeA/100)+(pessoasCidadeA));
				taxaCB= (int) ((pessoasCidadeB*anosCidadeB/100)+(pessoasCidadeB));
				pessoasCidadeA= taxaCA;
				pessoasCidadeB= taxaCB;
				cont+=1;
				if(cont>100) {
					break;
				}
			}
			
			if(cont>100) {
				System.out.println("Mais de 1 seculo.");

			} else {
				System.out.println(cont + " anos.");
			}
	
			
		}
	}
	
	
}

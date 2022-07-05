package problems;

import java.util.Locale;
import java.util.Scanner;

public class CorvoContador1848 {
	
	public static int encontraBinario(String piscada) {
		switch(piscada) {
			case "---":
				return 0;
			case "--*":
				return 1;
			case "-*-":
				return 2;
			case "*--":
				return 4;
			case "-**":
				return 3;
			case "*-*":
				return 5;
			case "**-":
				return 6;
			case "***":
				return 7;	
			default: 
				return -1;
		}
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String linha;
		int canto = 0;
		int[] res = new int[3];
		int soma = 0;
		while(canto < 3) {
			linha = sc.nextLine();
			if(linha.equals("caw caw")) {
				res[canto] = soma;
				canto++;
				soma = 0;
			} else {
				soma += encontraBinario(linha);
			}
			
		}
		for(int i=0;i<3;i++) {
			System.out.println(res[i]);
		}
		
		sc.close();
	}

}

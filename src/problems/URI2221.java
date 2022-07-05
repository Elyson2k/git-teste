package problems;

import java.util.Locale;
import java.util.Scanner;

public class URI2221 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=0; i<x; i++) {
			int bonus = sc.nextInt();
			int atkDabriel = sc.nextInt();
			int defDabriel = sc.nextInt();
			int lvlTreinadorDabriel = sc.nextInt();
			int atkGuarte = sc.nextInt();
			int defGuarte = sc.nextInt();
			int lvlTreinadorGuarte = sc.nextInt();
			int valorGolpeDabriel = (atkDabriel + defDabriel) / 2;
			int valorGolpeGuarte = (atkGuarte + defGuarte) / 2;
			int vf;
			
			if(lvlTreinadorDabriel%2==0) {
				 vf = (valorGolpeDabriel + bonus);
			} else {
				 vf = (valorGolpeGuarte + bonus);
			}
			if(valorGolpeDabriel>valorGolpeGuarte) {
				System.out.println("Dabriel");
			} else if(valorGolpeDabriel<valorGolpeGuarte) {
				System.out.println("Guarte");
			} else {
				System.out.println("Empate");
			}
		}
		

	}

}

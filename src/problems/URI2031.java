package problems;

import java.util.Scanner;

public class URI2031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=0; i<x; i++) {
			String op1 = sc.next();
			String op2 = sc.next();
			if(op1.equals("ataque") && op2.equals("ataque")) {
				System.out.println("Aniquilacao mutua");
			} else if(op1.equals("papel") && op2.equals("papel")) {
				System.out.println("Ambos venceram");
			} else if(op1.equalsIgnoreCase("ataque")) {
				System.out.println("Jogador 1 venceu");
			} else if(op2.equals("ataque")) {
				System.out.println("Jogador 2 venceu");
			} else if(op1.equals("papel")) {
				System.out.println("Jogador 2 venceu");
			} else if(op2.equals("papel")) {
				System.out.println("Jogador 1 venceu");
			} else {
				System.out.println("Sem ganhador");
			}
			
			
		}

	}

}

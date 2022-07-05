package problems;

import java.util.Scanner;

public class URI1131 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int gremio;
		int inter;
		int totalGrenais=0;
		int grenalParada;
		int vitoriaInter = 0;
		int vitoriaGremio = 0;
		int empate = 0;
		int maisVitorias = 0;
		
		while (true) {
			inter = sc.nextInt();
			gremio = sc.nextInt();
			System.out.printf("Novo grenal (1-sim 2-nao)%n");
			if(inter>gremio) {
				vitoriaInter++;
			}
			if(gremio>inter) {
				vitoriaGremio++;
			}
			if(inter==gremio) {
				empate++;
			}
			
			
			grenalParada = sc.nextInt();
			
			if(grenalParada==1) {
				totalGrenais++;
			}
			if(grenalParada==2) {
				System.out.printf("%d grenais%n", totalGrenais+1);
				System.out.printf("Inter:%d%n", vitoriaInter);
				System.out.printf("Gremio:%d%n", vitoriaGremio);
				System.out.printf("Empates:%d%n", empate);
				if(vitoriaInter>vitoriaGremio) {
					System.out.println("Inter venceu mais");
				} else {
					System.out.println("Gremio venceu mais");
				}
				break;
			}
			

		}

	}
}
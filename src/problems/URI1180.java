package problems;

import java.util.Scanner;

public class URI1180 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] vetor = new int[x]; 
		int menor=9999,pos=0;
		int contPos=0;
		for(int i=0; i<x; i++) {
			vetor[i] = sc.nextInt();
			if(vetor[i]<menor) {
				menor=vetor[i];
				contPos=i;
			}
		}
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: "+ contPos);
	}

}

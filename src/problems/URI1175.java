package problems;

import java.util.Scanner;

public class URI1175 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor =  new int[20];
		int i=0;
		int j=19;
		for(int i2=0; i2<20; i2++) {
			vetor[i2]=sc.nextInt();
		}
		while(i<j) {
			int aux = vetor[i];
			vetor[i]=vetor[j];
			vetor[j]=aux;
			i++;
			j--;
		}
		for(int i2=0; i2<20; i2++) {
			System.out.printf("N[%d] = %d%n", i2, vetor[i2]);
		}
		
	}

}

package problems;

import java.util.Scanner;

public class URI1179 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int contPares=0;
		int contImpares=0;
		int[] vetorPar=new int[5];
		int[] vetorImpar=new int[5];
		
		for(int i=0; i<15; i++) {
			x = sc.nextInt();
			if(x%2==0) {
				vetorPar[contPares]=x;
				contPares++;
			}
			else {
				vetorImpar[contImpares]=x;
				contImpares++;
			}
			if(contPares==5) {
				for(int c=0; c<4; c++) {
					System.out.printf("par[%d] = %d%n",c, vetorPar[c]);
				}
			}
			if(contImpares==5) {
				for(int c=0; c<4; c++) {
					System.out.printf("impar[%d] = %d%n",c, vetorImpar[c]);
				}
			}
		}
		

	}

}

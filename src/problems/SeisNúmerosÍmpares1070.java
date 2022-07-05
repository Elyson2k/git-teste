package problems;

import java.util.Locale;
import java.util.Scanner;

public class SeisNúmerosÍmpares1070 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		int X[] = new int[5];
		int imp=0,par=0,pos=0,neg=0;
		for(int i=0; i<5; i++ ) {
			X[i] = sc.nextInt();
			if(X[i]%2!=0) {
				imp++;
			}
			if(X[i]%2==0 || X[i]==0) {
				par++;
			}
			if(X[i]>0) {
				pos++;
			}
			if(X[i]<0){
				neg++;
			}
			
		}
		System.out.printf("%d valor(es) par(es)%n", par);
		System.out.printf("%d valor(es) impar(es)%n", imp);
		System.out.printf("%d valor(es) positivo(s)%n", pos);
		System.out.printf("%d valor(es) negativo(s)%n", neg);

	}

}

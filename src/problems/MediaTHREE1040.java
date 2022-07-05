package problems;

import java.util.Locale;
import java.util.Scanner;

public class MediaTHREE1040 {

	public static void main(String[] args) {
		
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		double n1,n2,n3,n4;
		double soma=0;
		double media,notaExame=0;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		soma+=(2*n1)+(3*n2)+(4*n3)+(1*n4);
		
		media=soma/10;
		System.out.printf("Media: %.1f%n", media);
		if(media>=7) {
			System.out.println("Aluno aprovado.");
		}else if(media >= 5.0 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			notaExame = sc.nextDouble();
			System.out.println("Nota do exame: " + notaExame);
		if((media+notaExame/2) >=5.0) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f", (media+notaExame)/2);
		}else{
				System.out.println("Aluno reprovado");
				System.out.printf("Media final: %.1f", (media+notaExame)/2);
			}
		}else if(media<5) {
			System.out.println("Aluno reprovado.");
		}
		
		
	}

}

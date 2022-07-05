package problems;

import java.util.Locale;
import java.util.Scanner;

public class AsAbasDePéricles2061 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		int inicioAbas,acoes;
		inicioAbas = sc.nextInt();
		acoes = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<acoes; i++) {
			String acao = sc.nextLine();
			if(acao.equals("fechou")) {
				inicioAbas++;
			}
			if(acao.equals("clicou")) {
				inicioAbas--;
			}
		}
		System.out.println(inicioAbas);
	}

}

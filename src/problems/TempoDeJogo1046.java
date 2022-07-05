package problems;

import java.util.Locale;
import java.util.Scanner;

public class TempoDeJogo1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int horaInicio = sc.nextInt();
		int horaTermino = sc.nextInt();
		int duracao = 24-(24 + horaInicio - horaTermino) % 24;
		if(horaInicio==horaTermino) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else {
			System.out.println("O JOGO DUROU "+ duracao +" HORA(S)");
		}
		
		

	}

}

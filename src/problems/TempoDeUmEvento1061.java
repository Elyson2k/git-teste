package problems;

import java.util.Locale;
import java.util.Scanner;

public class TempoDeUmEvento1061 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		String diaInicio = sc.nextLine();
		int d1 = sc.nextInt();
		sc.next();
		int horas = sc.nextInt();
		sc.next();
		int minutos = sc.nextInt();
		sc.next();
		int segundos = sc.nextInt();
		String diaTermino = sc.nextLine();
		int d2 = sc.nextInt();
		int horasTermino = sc.nextInt();
		int minutosTermino = sc.nextInt();
		int segundosTermino = sc.nextInt();
		int formulaDia = d2-d1;
		int formulaHora = horasTermino-horas;
		int formulaMinutos = minutosTermino-minutos;
		int formulaSegundos = segundosTermino-segundos;
		System.out.println(formulaDia + "dia(s)");
		System.out.println(formulaHora + "hora(s)");
		System.out.println(formulaMinutos + "minuto(s)");
		System.out.println(formulaSegundos + "segundo(s)");
	}

}

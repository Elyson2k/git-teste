package estruturasdedados;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		System.out.printf("Quantas pessoas você vai registrar? ");
		int x = sc.nextInt();
		List<Integer> id = new ArrayList<Integer>();
		List<String> name = new ArrayList<String>();
		List<Double> salario = new ArrayList<Double>();
		sc.nextLine();
		for(int i=0; i<x; i++) {
			
			System.out.printf("Emplyooe #%d%n", i+1);
			System.out.printf("Id: ");
			id.add(i);
			System.out.printf("Name: ");
			name.add(sc.nextLine());
			System.out.printf("Salary: ");
			salario.add((double) i);
			
		}
		
	}

}

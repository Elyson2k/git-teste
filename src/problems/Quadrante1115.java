package problems;

import java.util.Locale;
import java.util.Scanner;

public class Quadrante1115 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		if(X>0 && Y>0) {
			System.out.println("primeiro");
		} else if(X > 0 && Y < 0) {
			System.out.println("quarto");
		} else if(X < 0 && Y < 0) {
			System.out.println("terceiro");
		} else if(X<0 && Y > 0) {
			System.out.println("segundo");
		}
		while(X != 0 && Y != 0) {
			X = sc.nextInt();
			Y = sc.nextInt();
			if(X>0 && Y>0) {
				System.out.println("primeiro");
			} else if(X > 0 && Y < 0) {
				System.out.println("quarto");
			} else if(X < 0 && Y < 0) {
				System.out.println("terceiro");
			} else if(X<0 && Y > 0) {
				System.out.println("segundo");
			}
		}

	}

}

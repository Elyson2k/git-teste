package problems;

import java.util.Locale;
import java.util.Scanner;

public class Animal1049 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		String animal1 = sc.nextLine();
		String animal2 = sc.nextLine();
		String animal3 = sc.nextLine();
		if(animal1.equals("vertebrado")) {
			if(animal2.equals("ave")) {
				if(animal3.equals("carnivoro") || animal3.equals("onivoro")){
					if(animal3.equals("carnivoro")) {
						System.out.println("aguia");
					} else {
						System.out.println("pomba");
					}
				}
			}
		}
		if(animal1.equals("vertebrado")) {
			if(animal2.equals("mamifero")) {
				if(animal3.equals("herbivoro") || animal3.equals("onivoro")){
					if(animal3.equals("onivoro")) {
						System.out.println("homem");
					} else {
						System.out.println("vaca");
					}
				}
			}
		}
		if(animal1.equals("invertebrado")) {
			if(animal2.equals("inseto")) {
				if(animal3.equals("hematofago") || animal3.equals("herbivoro")){
					if(animal3.equals("hematofago")) {
						System.out.println("pulga");
					} else {
						System.out.println("largata");
					}
				}
			}
		}
		if(animal1.equals("invertebrado")) {
			if(animal2.equals("anelideo")) {
				if(animal3.equals("hematofago") || animal3.equals("onivoro")){
					if(animal3.equals("onivoro")) {
						System.out.println("minhoca");
					} else {
						System.out.println("sanguessuga");
					}
				}
			}
		}
		
		
		
	}

}

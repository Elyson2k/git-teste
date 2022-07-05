package problems;

import java.util.Locale;
import java.util.Scanner;

public class URI2029 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String[] formulario = new String[140];
		for (int i = 0; i < formulario.length; i++) {
			formulario[i] = sc.nextLine();
			
			if(formulario[i].length()<=140) {
				System.out.println("TWEET");
				break;
			} else {
				System.out.println("MUTE");
				break;
			}
		}
		
	}

}

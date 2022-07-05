package problems;

import java.util.Locale;
import java.util.Scanner;

public class URI1159 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		while(true) {
			int soma=0;
			int x = sc.nextInt();
			if(x==0) break;
			for(int i=x; i<=x+9; i++) {
				if(i%2==0) {
					soma+=i;
					
				}	
			}
			System.out.println(soma);
		}

	}

}

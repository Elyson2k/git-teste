package problems;

import java.util.Locale;
import java.util.Scanner;

public class URI1101 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		int soma=0;
		
		while(true) {
			x = sc.nextInt();
			y = sc.nextInt();
			if(x<=0 || y<=0) break;
			if(x<y) {
				for(x=x; x<=y; x++) {
					soma+=x;
					System.out.printf("%d ", x);
				}
				System.out.println("Sum=" + soma);
				soma=0;
			} else {
				for(y=y; y<=x; y++) {
					soma+=y;
					System.out.printf("%d ", y);
				}
				System.out.println("Sum="+soma);
				soma=0;
			}
			

		}	
	}
}



package problems;

import java.util.Locale;
import java.util.Scanner;

public class Pref�cio1837 {

	public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int q, r;
        if (a >= 0) {
        	q = a / b;
        	r = a % b;	
        } else {
        	int x = 0, y = 0;
        	
        	if (b < 0) x = b * -1;
        	else x = b;
        	
        	for (r = 0; r < x; r++) {
        		y = a - r;
        		if (y % b == 0) break;
        	}
        	q = y / b;
        }
        
        System.out.println(q + " " + r);
    }
	
}

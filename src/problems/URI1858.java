package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class URI1858 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int menor=99999;
		
		List<Integer> lista = new ArrayList<Integer>();
		
		for (int i = 0; i < x; i++) {
			lista.add(sc.nextInt());
			
			if(lista.get(i)<menor) {
				menor=lista.get(i);
			}
		}
		System.out.println(lista.indexOf(menor)+1);
		
	}

}

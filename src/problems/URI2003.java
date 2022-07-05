package problems;

import java.util.Scanner;

import java.util.Scanner;

public class URI2003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] atraso = sc.nextLine().split(":");
			int h = Integer.parseInt(atraso[0]);
			int m = Integer.parseInt(atraso[1]);
			
			switch (h) {
			case(7): System.out.println("Atraso maximo: " + m); break;
			case(8): System.out.println("Atraso maximo: " + (60 + m)); break;
			case(9): System.out.println("Atraso maximo: " + (120 + m)); break;
			default: System.out.println("Atraso maximo: 0");
		}
		}
		
	}

}



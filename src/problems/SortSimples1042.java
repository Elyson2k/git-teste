package problems;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Comparator;

public class SortSimples1042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int A = sc.nextInt(); 
		int B = sc.nextInt();
		int C = sc.nextInt();
		ArrayList<Integer> n1 = new ArrayList<Integer>();
		n1.add(A);
		n1.add(B);
		n1.add(C);
		n1.sort(Comparator.naturalOrder());
		System.out.printf("%d%n%d%n%d%n", n1.get(0), n1.get(1), n1.get(2));
		
		System.out.printf("%d%n%d%n%d%n", A,B,C);
	}

}

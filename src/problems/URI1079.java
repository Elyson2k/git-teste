package problems;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1079 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DecimalFormat df=new DecimalFormat("0.0");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		double soma=0;
		for(int i=0; i<x; i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			soma=(2*n1 + 3*n2 + 5*n3);
			double media = soma/10;
			System.out.println(df.format(media));
		}

	}

}

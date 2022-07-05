package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ParImpar1074 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		List<String> resultados = new ArrayList<>();
		int A = sc.nextInt();
		for(int i=0; i<A; i++) {
			int daVez = sc.nextInt();
			if(daVez%2==0 && daVez > 0) {
				resultados.add("EVEN POSITIVE");
			} else if(daVez%2==-1 && daVez<0) {
				resultados.add("ODD NEGATIVE");
			} else if(daVez%2==1 && daVez>0) {
				resultados.add("ODD POSITIVE");
			} else if(daVez%2==0 && daVez<0) {
				resultados.add("EVEN NEGATIVE");
			} else if(daVez==0) {
				resultados.add("NULL");
			}
		}
		for(String res : resultados) {
			System.out.println(res);
		}
		
	}

}

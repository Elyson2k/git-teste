package problems;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Esfera1011 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat(".000");
		Locale.setDefault (Locale.US); 
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double formulaTR = A * C / 2;
		double formulaCR = Math.pow(C,2) * 3.14159 ;
		double formulaTRPZ = (A + B) * C / 2;
		double areaQRD = Math.pow(B, 2);
		double finalLast = A*B;
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", formulaTR,formulaCR,formulaTRPZ,areaQRD,finalLast);
	}

}

package curso;

import java.util.Locale;
import java.util.Scanner;

public class SemClasse {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double xA, xB, xC, yA, yB, yC;
		System.out.println("Coloque as medidas X do triângulo: ");
		xA = leitura.nextDouble();
		xB = leitura.nextDouble();
		xC = leitura.nextDouble();
		System.out.println("Coloque as medidas Y do triângulo: ");
		yA = leitura.nextDouble();
		yB = leitura.nextDouble();
		yC = leitura.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
	}
}
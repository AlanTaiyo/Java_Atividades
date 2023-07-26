package entities;

import java.util.Locale;
import java.util.Scanner;

public class ComClasse {

	public static void main(String[] args) {
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		Scanner leitura = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Coloque as medidas X do triângulo: ");
		x.a = leitura.nextDouble();
		x.b = leitura.nextDouble();
		x.c = leitura.nextDouble();
		System.out.println("Coloque as medidas Y do triângulo: ");
		y.a = leitura.nextDouble();
		y.b = leitura.nextDouble();
		y.c = leitura.nextDouble();
		
		leitura.close();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else if (areaX == areaY) {
			System.out.println("The two areas are equal");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
	}

}

package curso;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int inteiro = 2;
		double x = 10.35784;
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		double issoEUmCasting = (double) idade;
		
		System.out.printf(issoEUmCasting);
		System.out.println(inteiro);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.println("Hello World!");
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}

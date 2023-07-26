package curso;

import java.util.Scanner;

public class AprendendoScanner {

	public static void main(String[] args) {
		Scanner recebeValor = new Scanner(System.in);
		String x;
		int y;
		double z;
		x = recebeValor.next();
		y = recebeValor.nextInt();
		z = recebeValor.nextDouble();
		System.out.printf("Você digitou: %s, %d, %.2f ", x, y, z);
		
		recebeValor.close();

	}

}

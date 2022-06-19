package projetoTarget;

import java.util.Locale;
import java.util.Scanner;

public class VariavelSoma {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int indice = 13;
		int soma = 0;
		int K = 0;
		
		while (K < indice) {
			K += 1;
			soma += K;
		}		
		System.out.println(soma);
	}

}

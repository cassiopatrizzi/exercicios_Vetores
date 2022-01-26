package vetor.exercicios_resolvidos;

import java.util.Scanner;

public class ImpossivelCalcular {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa para ler um n�mero indeterminado de dados, contendo cada um
		 * a idade de um indiv�duo. O �ltimo dado, que n�o entrar� nos c�lculos, cont�m
		 * um valor de idade negativa. Calcular e imprimir a idade m�dia deste grupo de
		 * indiv�duos. Se for entrado um valor negativo na primeira vez, mostrar a msg:
		 * "Imposs�vel calcular".
		 */

		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int soma = 0;
		int cont = 0;
		
		while (idade >= 0) {
			soma += idade;
			cont ++;
		
			idade = sc.nextInt();
		}
		
		if (cont > 0) {
			double media = (double) soma / cont;
			System.out.printf("%.2f%n", media);
		}
		else {
			System.out.println("Imposs�vel calcular!!");
		}
		sc.close();

	}

}

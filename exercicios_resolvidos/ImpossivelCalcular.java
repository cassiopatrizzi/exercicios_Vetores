package vetor.exercicios_resolvidos;

import java.util.Scanner;

public class ImpossivelCalcular {

	public static void main(String[] args) {

		/*
		 * Faça um programa para ler um número indeterminado de dados, contendo cada um
		 * a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém
		 * um valor de idade negativa. Calcular e imprimir a idade média deste grupo de
		 * indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a msg:
		 * "Impossível calcular".
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
			System.out.println("Impossível calcular!!");
		}
		sc.close();

	}

}

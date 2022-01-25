package vetor.exercicios_propostos;

import java.util.Scanner;

public class NumerosParesEQuantidade {

	public static void main(String[] args) {

/*		 exercicio_02
		
		 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
		 * seguida, mostre na tela: - todos os números pares - a quantidade de números
		 * pares
 */

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] numPares = new int[N];

		for (int i = 0; i < N; i++) {
			numPares[i] = sc.nextInt();
		}

//		1: mostrando números pares
		System.out.print("Os números pares digitados foram: ");
		for (int i = 0; i < N; i++) {
			if (numPares[i] % 2 == 0)
				System.out.print(numPares[i] + " ");
		}
		System.out.println();

//		2: mostrando a quantidade
		int quantidadeDePares = 0;
		for (int i = 0; i < N; i++) {
			if (numPares[i] % 2 == 0) {
				quantidadeDePares++;
			}
		}
		System.out.println("Quantidade de números pares: " + quantidadeDePares);

		sc.close();
	}

}

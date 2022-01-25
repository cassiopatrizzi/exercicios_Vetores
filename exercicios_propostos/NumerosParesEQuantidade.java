package vetor.exercicios_propostos;

import java.util.Scanner;

public class NumerosParesEQuantidade {

	public static void main(String[] args) {

/*		 exercicio_02
		
		 * Fa�a um programa que leia N n�meros inteiros e armazene-os em um vetor. Em
		 * seguida, mostre na tela: - todos os n�meros pares - a quantidade de n�meros
		 * pares
 */

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] numPares = new int[N];

		for (int i = 0; i < N; i++) {
			numPares[i] = sc.nextInt();
		}

//		1: mostrando n�meros pares
		System.out.print("Os n�meros pares digitados foram: ");
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
		System.out.println("Quantidade de n�meros pares: " + quantidadeDePares);

		sc.close();
	}

}

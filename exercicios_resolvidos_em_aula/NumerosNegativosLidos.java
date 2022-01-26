package vetor.exercicios_resolvidos;

import java.util.Scanner;

public class NumerosNegativosLidos {

	public static void main(String[] args) {

		/*
		 * exercicio_resolvido_01 
		 * Fa�a um programa que leia N n�meros inteiros e
		 * armazene-os em um vetor. Em seguida, mostrar na tela todos os n�meros
		 * negativos lidos.
		 */

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] vet = new int[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextInt();
		}

		System.out.print("N�meros negativos: ");
		for (int i = 0; i < N; i++) {
			if (vet[i] < 0) {
				System.out.print(vet[i] + " ");
			}
		}
		sc.close();
	}

}

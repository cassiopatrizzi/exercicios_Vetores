package vetor.exercicios_propostos;

import java.util.Scanner;

public class Elementos_A_B_C {

	public static void main(String[] args) {

/*
		  Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em
		  seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
		  elementos correspondentes de A e B. Imprima o vetor C gerado.
*/

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}

		int[] C = new int[N];
		for (int i = 0; i < N; i++) {
			C[i] = A[i] + B[i];
		}
		for (int i = 0; i < N; i++) {
			System.out.print(C[i] + " ");
		}

		sc.close();
	}

}

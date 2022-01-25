package vetor.exercicios_propostos;

import java.util.Locale;
import java.util.Scanner;

public class Media_AbaixaDaMedia {

	public static void main(String[] args) {

		/*
		 * exercicio_04
		 * 
		 * Fazer um programa para ler um vetor de N números reais. Em seguida, mostrar
		 * na tela a média aritmética de todos elementos. Depois mostrar todos os
		 * elementos do vetor que estejam abaixo da média.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] vet = new double[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}

//		1: calculando e mostrando a média
		double soma = 0.0;
		for (int i = 0; i < N; i++) {
			soma = soma + vet[i];
		}

		double media = soma / N;
		System.out.printf("%.3f%n", media);

//		2: mostrando os elementos abaixo da média
		for (int i = 0; i < N; i++) {
			if (vet[i] < media) {
				System.out.printf("%.1f%n", vet[i]);
			}
		}

		sc.close();
	}

}

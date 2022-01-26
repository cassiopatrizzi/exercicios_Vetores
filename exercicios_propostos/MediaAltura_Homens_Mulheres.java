package vetor.exercicios_propostos;

import java.util.Locale;
import java.util.Scanner;

public class MediaAltura_Homens_Mulheres {

	public static void main(String[] args) {

		/*
		 * exercicio_08
		 * Tem-se um conjunto de dados contendo a altura e o sexo (M, F) de
		 * N pessoas. Fazer um programa que calcule e escreva: - a maior e a menor
		 * altura do grupo - a média de altura das mulheres - o número de homens
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] alturas = new double[N];
		char[] sexos = new char[N];

		for (int i = 0; i < N; i++) {
			alturas[i] = sc.nextDouble();
			sexos[i] = sc.next().charAt(0);
		}

//		1: menor altura
		double menorAltura = alturas[0];
		for (int i = 1; i < N; i++) {
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
		}
		System.out.printf("Menor altura = %.2f%n", menorAltura);

//		2: maior altura
		double maiorAltura = alturas[0];
		for (int i = 1; i < N; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
		}
		System.out.printf("Maior altura = %.2f%n", maiorAltura);

//		3: média das alturas das mulheres
		double somaAlturaMuheres = 0.0;
		int contMulheres = 0;
		for (int i = 0; i < N; i++) {
			if (sexos[i] == 'F') {
				somaAlturaMuheres = somaAlturaMuheres + alturas[i];
				contMulheres++;
			}
		}

		if (contMulheres == 0) {
			System.out.println("Não há nenhuma mulher dentre as pessoas");
		} else {
			double media = somaAlturaMuheres / contMulheres;
			System.out.printf("Média das alturas das mulheres = %.2f%n", media);

		}

		int contHomens = 0;
		for (int i = 0; i < N; i++) {
			if (sexos[i] == 'M') {
				contHomens++;
			}
		}
		System.out.println("Número de homens = " + contHomens);

		sc.close();

	}

}

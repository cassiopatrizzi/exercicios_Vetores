package vetor.exercicios_resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class IdadeAlturaMediaPessoas {

	public static void main(String[] args) {

		/*
		 * exercicio_resolviso_03 Fazer um programa para ler um número N, depois (apenas
		 * uma palavra sem espaços), idade e altura de N pessoas, conforme exemplo.
		 * Depois, mostrar na tela a altura média das pessoas e mostrar também a
		 * porcentagem de pessoas com menos de 16 anos.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] nomes = new String[N];
		int[] idades = new int[N];
		double[] alturas = new double[N];

		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			alturas[i] = sc.nextDouble();
		}

		double totalAltura = 0.0;
		for (int i = 0; i < N; i++) {
			totalAltura = totalAltura + alturas[i];
		}
		double mediaAltura = totalAltura / N;
		System.out.printf("Altura média: %.2f%n", mediaAltura);

		int cont = 0;
		for (int i = 0; i < N; i++) {
			if (idades[i] < 16) {
				cont++;
			}
		}
		double x = (double) cont * 100.0 / N;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n ", x);
		sc.close();

	}
}

package vetor.exercicios_resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class SomaEMedia {

	public static void main(String[] args) {

		/* exercicio_resolvido_02
		 * Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em
		 * seguida: - Imprimir todos os elementos do vetor - Mostrar a soma e a m�dia
		 * dos elementos do vetor
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] vet = new double[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
			System.out.print(vet[i] + " ");
		}
		System.out.println();
		System.out.print("A soma dos elementos �: ");
		double soma = 0;
		for (int i = 0; i < N; i++) {
			soma = soma + vet[i];
		}
		System.out.println();
		System.out.printf("%.2f%n", soma);

		System.out.println("A m�dia da soma �: ");
		double media = soma / N;
		for (int i = 0; i < N; i++) {
		}

		System.out.printf("%.2f%n", media);
		sc.close();
	}

}

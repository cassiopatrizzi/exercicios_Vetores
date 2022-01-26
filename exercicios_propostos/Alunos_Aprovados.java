package vetor.exercicios_propostos;

import java.util.Locale;
import java.util.Scanner;

public class Alunos_Aprovados {

	public static void main(String[] args) {

		/*
		 * exercicio_07 
		 * Fazer um programa para ler um conjunto de N nomes de alunos, bem
		 * como as notas que eles tiraram no 1º e 2º semestres. Cada uma dessas
		 * informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos
		 * alunos aprovados, considerando aprovados aqueles cuja média das notas seja
		 * maior ou igual a seis.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] nomes = new String[N];
		double[] primSemestre = new double[N];
		double[] segSemestre = new double[N];

		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
			primSemestre[i] = sc.nextDouble();
			segSemestre[i] = sc.nextDouble();
		}

		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < N; i++) {
			double mediaSemestral = (primSemestre[i] + segSemestre[i]) / 2.0;
			if (mediaSemestral >= 6.0) {
				System.out.println(nomes[i]);
			}
		}

		sc.close();

	}

}

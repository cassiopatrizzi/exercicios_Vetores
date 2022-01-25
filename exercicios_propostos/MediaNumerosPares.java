package vetor.exercicios_propostos;

import java.util.Locale;
import java.util.Scanner;

public class MediaNumerosPares {
	
/*  exercicio_05	
	Fazer um programa para ler um vetor de N n�meros inteiros. 
	Em seguida, mostrar na tela a m�dia aritm�tica somente
	dos n�meros pares lidos. 
*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[] vet = new double[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}

		double somaDosPares = 0.0;
		int quantidadeDePares = 0;
		for (int i = 0; i < N; i++) {
			if (vet[i] % 2 == 0) {
				somaDosPares = somaDosPares + vet[i];
				quantidadeDePares++;
			}
		}

		if (quantidadeDePares == 0) {
			System.out.println("N�o havia nenhum n�mero par");
		} else {
			double media = somaDosPares / quantidadeDePares;
			System.out.printf("%.1f%n", media);
		}

		sc.close();

	}

}

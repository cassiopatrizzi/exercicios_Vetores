package vetor.exercicios_propostos;

import java.util.Scanner;

public class NomesIdades {

	public static void main(String[] args) {

		/* exercicio_06
		 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
		 * idades. Depois, mostrar na tela o nome da pessoa mais velha.
		 */

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] nomes = new String[N];
		int[] idades = new int[N];

		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
		}

//		1: primeiro vamos encontrar a posição da maior idade
		int maiorIdade = idades[0];
		int posicaoMaiorIdade = 0;

		for (int i = 0; i < N; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				posicaoMaiorIdade = i;
			}
		}

//		2: agora vamor acessar o vetor de nomes na posição da maior idade
		System.out.println("Pessoa mais velha: " + nomes[posicaoMaiorIdade]);

		sc.close();

	}

}

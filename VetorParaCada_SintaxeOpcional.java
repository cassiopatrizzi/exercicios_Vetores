package vetor;

import java.util.Scanner;

public class VetorParaCada_SintaxeOpcional {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um valor N e depois o nome de N pessoas. Em
		 * seguida, mostrar os nomes lidos.
		 */

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] nomes = new String[N];

		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
		}
		System.out.println("Nomes lidos: ");
		for (String s : nomes) {
//			(int i = 0; i < N; i++) sintaxe opcional
			System.out.println(s);
		}

		sc.close();
	}
}

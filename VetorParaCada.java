package vetor;

import java.util.Scanner;

public class VetorParaCada {

	public static void main(String[] args) {
		
//		Sintaxe opcional

		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		String[] nomes = new String[N];
		
		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
		}
		System.out.println("Nomes lidos:");		
		for (String s : nomes) { // Opcional
		  //(int i = 0; i < N; i++);
			System.out.println(s);
		}
		sc.close();
	}
}

package herick;

import java.util.Scanner;

public class herickclass {

	public static void main(String[] args) {
		int n1, n2, n3;
		int t1, t2;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual o valor de n1 entre '1' e '9': ");
		n1 = teclado.nextInt();
		while (n1 < 1 || n1 > 9) {
			System.out.println("ERRO DIGITE OUTRO VALOR DE N1");
			System.out.print("Qual o valor de n1 entre '1' e '9': ");
			n1 = teclado.nextInt();
		}
		System.out.print("Qual o valor de n2 entre '1' e '9': ");
		n2 = teclado.nextInt();
		while (n2 < 1 || n2 > 9) {
			System.out.println("ERRO DIGITE OUTRO VALOR DE N2");
			System.out.print("Qual o valor de n2 entre '1' e '9': ");
			n2 = teclado.nextInt();
		}
		System.out.print("Qual o valor de n3 entre '1' e '9': ");
		n3 = teclado.nextInt();
		while (n3 < 1 || n3 > 9) {
			System.out.println("ERRO DIGITE OUTRO VALOR DE N3");
			System.out.print("Qual o valor de n3 entre '1' e '9': ");
			n3 = teclado.nextInt();
		}
		teclado.close();
		System.out.println("Os valores recebidos foram " + n1 + " " + n2 + " " + n3);
		if (n1 == n2 && n1 == n3) {
			System.out.println("TODOS OS VALORES SAO IGUAIS");
			System.out.println("TABELA 1");
			for (int i = 1; i <= n1; i++) {
				t1 = n1 * i;
				System.out.println(t1);
			}
			System.out.println("TABELA 2");
			for (int i = n1; i <= 9; i++) {
				t2 = n1 * i;
				System.out.println(t2);
			}

		} else {
			if (n1 > n2 && n1 > n3) {
				System.out.println("O maior valor é o " + n1);
				System.out.println("TABELA 1");
				for (int i = 1; i <= n1; i++) {
					t1 = n1 * i;
					System.out.println(t1);
				}
				System.out.println("TABELA 2");
				for (int i = n1; i <= 9; i++) {
					t2 = n1 * i;
					System.out.println(t2);
				}
			} else if (n2 > n1 && n2 > n3) {
				System.out.println("O maior valor é o " + n2);
				System.out.println("TABELA 1");
				for (int i = 1; i <= n2; i++) {
					t1 = n2 * i;
					System.out.println(t1);
				}
				System.out.println("TABELA 2");
				for (int i = n2; i <= 9; i++) {
					t2 = n2 * i;
					System.out.println(t2);
				}
			} else {
				System.out.println("O maior valor é o " + n3);
				System.out.println("TABELA 1");
				for (int i = 1; i <= n3; i++) {
					t1 = n3 * i;
					System.out.println(t1);
				}
				System.out.println("TABELA 2");
				for (int i = n3; i <= 9; i++) {
					t2 = n3 * i;
					System.out.println(t2);
				}

			}

		}
	}

}

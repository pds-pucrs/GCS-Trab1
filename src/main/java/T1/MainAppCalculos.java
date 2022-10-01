package T1;

import java.io.IOException;
import java.util.Scanner;

public class MainAppCalculos {

	static int soma;

	public static int somaImpares(int X, int Y) {
		Scanner leitor = new Scanner(System.in);
		int N = 1;
		for (int i = 0; i < N; i++) {
			soma = 0;

			if (Y > X) {
				for (int j = X + 1; j < Y; j++) {
					if (j % 2 != 0)
						soma += j;
				}
			} else {
				for (int j = Y + 1; j < X; j++) {
					if (j % 2 != 0)
						soma += j;
				}
			}
			System.out.println(soma);
			
		}
		return soma;
	}
}

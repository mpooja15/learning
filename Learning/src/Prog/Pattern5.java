package Prog;

public class Pattern5 {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			// char letter='A';
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(65+i-1) + " ");

			}
			System.out.println(" ");

		}

	}

}

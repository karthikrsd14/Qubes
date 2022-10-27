package com.ideassion.lab.base;

public class ConsolePrint extends BaseClass {

	public static void main(String[] args) {
		Consoleprint();
	}
	public static void Consoleprint() {
		try {
			Thread.sleep(1000);
			// Print in I letter
			for (int j = 0; j <= 6; j++) {
				System.out.print(" * ");
			}
			System.out.println();

			for (int j = 0; j <= 5; j++) {
				System.out.println("          *  ");
			}
			for (int j = 0; j <= 6; j++) {
				System.out.print(" * ");
			}
			System.out.println();
			System.out.println("");
			// Print in D letter
			Thread.sleep(1000);
			int k = 0;
			for (int i = 0; i <= 10; i++) {
				if (k != 6) {
					k++;

					System.out.print(" *");
				} else {
					break;
				}

			}
			System.out.println();

			int a = 8;
			for (int i = 0; i <= a; i++) {
				for (int j = 0; j <= a / 2; j++) {

					if (j != a / 2) {
						System.out.print(" *     ");
						System.out.println("     * ");
						break;
					} else {
						System.out.println("");
					}
				}
			}
			int b = 0;
			for (int i = 0; i <= 10; i++) {
				if (b != 6) {
					b++;

					System.out.print(" *");
				} else {
					break;
				}

			}
			System.out.println();

			System.out.println(" ");
			
			//print the letter in E
			Thread.sleep(1000);

			for (int j = 0; j <= 6; j++) {
				System.out.print(" * ");
				
			}
			System.out.println();

			for (int j = 0; j <= 5; j++) {
				System.out.println(" *  ");
				if(j==1) {
					System.out.print(" *  *");
					System.out.print(" * ");
					System.out.print(" * ");
					System.out.print(" * ");
					System.out.print(" * ");
				}
			}
			for (int j = 0; j <= 6; j++) {
				System.out.print(" * ");
			}
			System.out.println();
			System.out.println("");

			Thread.sleep(1000);
			// Print in A letter
			int n = 8;
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= n / 2; j++) {
					if ((j == 0 || j == n / 2) && i != 0 || i == 0 && j != n / 2 || i == n / 2)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

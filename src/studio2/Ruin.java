package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your starting amount ($): ");
		int sa = in.nextInt();

		System.out.println("Win Chance: ");
		double wc = in.nextDouble();

		System.out.println("winLimit: ");
		double wl = in.nextDouble();

		System.out.println("total simulations: ");
		double ts = in.nextDouble();

		double ca = 0;

		for (int i = 0; i < ts; i++) {

			while(ca != wl && ca != 0) {
			if (Math.random() < wc) {
				ca = sa + 1;
				System.out.println("you win");

			} else {
				ca = sa - 1;
				System.out.println("your lose");

			}
			System.out.println(ca = 0 && ca = w);

			}

		}
	}
}
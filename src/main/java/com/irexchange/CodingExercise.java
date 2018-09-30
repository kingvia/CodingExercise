package com.irexchange;

import com.irexchange.controller.Game;
import com.irexchange.model.Child;

public class CodingExercise {

	public static void main(String[] args) {
		// argument has to be correct
		if (args.length != 2) {
			printUsage();
			System.exit(0);
		}
		try {
			int n = Integer.parseInt(args[0]);
			int k = Integer.parseInt(args[1]);

			// n and k has to be positive numbers.
			if (n <= 0 || k <= 0) {
				printUsage();
				System.exit(0);
			}

			Game game = new Game(n, k);
			game.playGame();

			System.out.println("Sequence of children's ID as they go out:");
			for (Child c : game.getResultList()) {
				System.out.print(c.getId());
				System.out.print(" ");
			}

			System.out.println();
			System.out.println("ID of the winning child:");
			System.out.println(game.getWinner().getId());
		} catch (Exception exc) {
			printUsage();
		}

	}

	/**
	 * Print out the usage info
	 */
	public static void printUsage() {
		System.out.println("Java com.irexchange.CodingExercise n k");
		System.out.println("n = Number of children stand around a circle");
		System.out.println(
				"k = Then starting with the first child, they count out from 1 until k. The k'th child is now out and leaves the circle.");
	}

}

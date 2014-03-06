package gr.kzps;

import gr.kzps.util.Constants;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Menu {

	private static Scanner scanner = null;

	private String welcomeMessage() {
		StringBuilder strBld = new StringBuilder();
		strBld.append("Welcome to OPAP draws client").append("\n");
		strBld.append("----------------------------").append("\n");
		strBld.append("Make your choice").append("\n");

		return strBld.toString();
	}

	private String mainMenu() {
		StringBuilder strBld = new StringBuilder();
		List<String> games = new ArrayList<>();
		int index = 1;
		games.add(Constants.KINNO);
		games.add(Constants.LOTTO);
		games.add(Constants.JOKER);
		games.add(Constants.PROTO);
		games.add(Constants.SUPER3);
		games.add(Constants.EXTRA5);

		Iterator<String> gamesIt = games.iterator();

		while (gamesIt.hasNext()) {
			strBld.append(index).append("-").append(gamesIt.next())
					.append("\n");
			index++;
		}
		strBld.append("0-Exit").append("\n");
		index = 1;

		return strBld.toString();
	}

	private String gameMethods() {
		StringBuilder strBld = new StringBuilder();
		strBld.append("1-Latest draw").append("\n");
		strBld.append("2-Draws for the given date").append("\n");
		strBld.append("3-Draw for a specific competition number").append("\n");
		strBld.append("0-Back to main menu").append("\n");

		return strBld.toString();
	}

	// inputType 0 is for game choice
	// inputType 1 is for method choice
	private int getInputNumber(int inputType) {
		int inputNumber = -1;
		try {
			scanner = new Scanner(System.in);
			inputNumber = scanner.nextInt();
			if (inputType == 0) {
				while ((inputNumber > Constants.NUM_OF_GAMES)
						|| inputNumber < 0) {
					inputNumber = scanner.nextInt();
					System.out.println("Type a valid choice");
				}
			} else if (inputType == 1) {
				while ((inputNumber > Constants.NUM_OF_METHODS)
						|| inputNumber < 0) {
					inputNumber = scanner.nextInt();
					System.out.println("Type a valid choice");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("You should have entered a number");
			scanner.close();
			System.exit(-1);
		}

		return inputNumber;
	}

	public static void main(String[] args) {
		Menu menu = new Menu();
		boolean RUNNING = true;
		int gameChoice;
		int methodChoice;

		System.out.print(menu.welcomeMessage());

		while (RUNNING) {
			System.out.print(menu.mainMenu());
			gameChoice = menu.getInputNumber(0);

			if (gameChoice == 0) {
				scanner.close();
				System.exit(0);
			}

			System.out.print(menu.gameMethods());
			methodChoice = menu.getInputNumber(1);

			if (methodChoice == 0) {
				continue;
			}

			Selector selector = new Selector(gameChoice, methodChoice, scanner);
			selector.select();
		}
		// menu.closeRes();
		// System.exit(0);
	}
}
package gr.kzps;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Menu {
	private Scanner scanner;
	private static int NUM_OF_GAMES = 6;
	private static int NUM_OF_METHODS = 3;

	private void createRes() {
		scanner = new Scanner(System.in);
	}

	private void closeRes() {
		scanner.close();
	}

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
		games.add("Kino");
		games.add("Lotto");
		games.add("Joker");
		games.add("Proto");
		games.add("Super 3");
		games.add("Extra 5");

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
			inputNumber = scanner.nextInt();
			if (inputType == 0) {
				while ((inputNumber > NUM_OF_GAMES) || inputNumber < 0) {
					inputNumber = scanner.nextInt();
					System.out.println("Type a valid choice");
				}
			} else if (inputType == 1) {
				while ((inputNumber > NUM_OF_METHODS) || inputNumber < 0) {
					inputNumber = scanner.nextInt();
					System.out.println("Type a valid choice");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("You should have entered a number");
			closeRes();
			System.exit(-1);
		}

		return inputNumber;
	}

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.createRes();
		boolean RUNNING = true;
		int gameChoice;
		int methodChoice;
		System.out.print(menu.welcomeMessage());

		while (RUNNING) {
			System.out.print(menu.mainMenu());
			gameChoice = menu.getInputNumber(0);

			if (gameChoice == 0) {
				menu.closeRes();
				System.exit(0);
			}

			System.out.print(menu.gameMethods());
			methodChoice = menu.getInputNumber(1);
		}
		menu.closeRes();
		System.exit(0);
	}
}
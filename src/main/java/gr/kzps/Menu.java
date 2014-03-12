/*
 	Copyright (C) 2014
 	Antonis Kouzoupis <kouzoupis.ant@gmail.com>
 	
 	This file is part of OpapDraws.

    OpapDraws is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    OpapDraws is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with OpapDraws.  If not, see <http://www.gnu.org/licenses/>.
 */
package gr.kzps;

import gr.kzps.util.Constants;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Entry point of the program. Class that implements the main menu.
 * @author Antonis Kouzoupis
 */
public final class Menu {
	private Menu() {
		
	}
	/**
	 * Scanner should be closed only once, otherwise System.in is closed too.
	 * @see java.util.Scanner
	 */
	private static Scanner scanner = null;
	private static StringBuilder sb = null;

	/**
	 * Prints the welcome message.
	 * @return The welcome message
	 * @see StringBuilder
	 */
	private String welcomeMessage() {
		sb = new StringBuilder();
		sb.append("Welcome to OPAP draws client").append("\n");
		sb.append("----------------------------").append("\n");

		return sb.toString();
	}

	/**
	 * Prints the available game options.
	 * @return The available game options
	 * @see StringBuilder
	 * @see List
	 * @see ArrayList
	 * @see Iterator
	 */
	private String mainMenu() {
		sb = new StringBuilder();
		sb.append("Choose the game you prefer:").append("\n");
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
			sb.append(index).append("-").append(gamesIt.next())
					.append("\n");
			index++;
		}
		sb.append("0-Exit").append("\n");
		index = 1;

		return sb.toString();
	}

	/**
	 * Prints the available draw methods.
	 * @return The available draw methods
	 * @see StringBuilder
	 */
	private String gameMethods() {
		sb = new StringBuilder();
		sb.append("Choose the fetch method you prefer:").append("\n");
		sb.append("1-Latest draw").append("\n");
		sb.append("2-Draws for the given date").append("\n");
		sb.append("3-Draw for a specific competition number").append("\n");
		sb.append("0-Back to main menu").append("\n");

		return sb.toString();
	}

	/**
	 * Reads user's input for the main menu and validates it.
	 * @param inputType 0 is for game choice and 1 is for method choice
	 * @return User's input
	 * @see Scanner
	 * @exception InputMismatchException
	 * @see Constants
	 */
	private int getInputNumber(final int inputType) {
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

	/**
	 * Prints main menu, user choose between games and different draw methods.
	 * @see Menu#welcomeMessage()
	 * @see Menu#mainMenu()
	 * @see Menu#getInputNumber(int)
	 * @see Menu#gameMethods()
	 * @see Selector
	 * @see Selector#select()
	 */
	public static void main(String[] args) {
		Menu menu = new Menu();
		int gameChoice;
		int methodChoice;

		System.out.print(menu.welcomeMessage());

		while (true) {
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
	}
}
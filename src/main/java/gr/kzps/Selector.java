package gr.kzps;

import java.util.Scanner;

import gr.kzps.util.Date;
import gr.kzps.util.Utils;

public class Selector {
	private int game;
	private int method;
	private Scanner scanner;

	public Selector(int game, int method, Scanner scanner) {
		super();
		this.game = game;
		this.method = method;
		this.scanner = scanner;
	}
	
	public void select() {
		Utils util = new Utils();
		
		switch (game) {
		case 1:
			// Kino
			if (method == 1) {

			} else if (method == 2) {
				Date date = util.getDate(scanner);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
			}
			break;
		case 2:
			// Lotto
			if (method == 1) {

			} else if (method == 2) {
				Date date = util.getDate(scanner);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
			}
			break;
		case 3:
			// Joker
			if (method == 1) {

			} else if (method == 2) {
				Date date = util.getDate(scanner);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
			}
			break;
		case 4:
			// Proto
			if (method == 1) {

			} else if (method == 2) {
				Date date = util.getDate(scanner);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
			}
			break;
		case 5:
			// Super3
			if (method == 1) {

			} else if (method == 2) {
				Date date = util.getDate(scanner);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
			}
			break;
		case 6:
			// Extra5
			if (method == 1) {

			} else if (method == 2) {
				Date date = util.getDate(scanner);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
			}
			break;
		}
	}
}

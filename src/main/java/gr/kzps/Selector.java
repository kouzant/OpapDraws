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

import java.util.Scanner;

import javax.xml.datatype.XMLGregorianCalendar;

import gr.kzps.util.Utils;

/**
 * Class which select the appropriate web service methods according to user
 * choices.
 * 
 * @author Antonis Kouzoupis
 * 
 */
public class Selector {
	/**
	 * Game identification number.
	 */
	private int game;
	/**
	 * Method identification number.
	 */
	private int method;
	/**
	 * Scanner should be closed only once, otherwise System.in is closed too.
	 * @see java.util.Scanner
	 */
	private Scanner scanner;

	/**
	 * Initialize the selection procedure.
	 * @param game Game identification number
	 * @param method Method identification number
	 * @param scanner Scanner object
	 */
	public Selector(final int game, final int method, final Scanner scanner) {
		super();
		this.game = game;
		this.method = method;
		this.scanner = scanner;
	}

	/**
	 * select the appropriate web service methods according to user choices.
	 * @see Utils
	 * @see QueryService
	 * @see MessageWrapper
	 * @see Utils#getDate(Scanner)
	 * @see Utils#getCompNum(Scanner)
	 * @see Utils#printer(MessageWrapper)
	 * @see XMLGregorianCalendar
	 */
	public void select() {
		Utils util = new Utils();
		QueryService qService = new QueryService();
		MessageWrapper messageWrapper = null;

		switch (game) {
		case 1:
			// Kino
			if (method == 1) {
				messageWrapper = qService.fetchKinoLatestDraw();
			} else if (method == 2) {
				XMLGregorianCalendar xmlGrCal = util.getDate(scanner);
				messageWrapper = qService.fetchKinoByDate(xmlGrCal);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
				messageWrapper = qService.fetchKinoByNumber(compNum);
			}
			break;
		case 2:
			// Lotto
			if (method == 1) {
				messageWrapper = qService.fetchLottoLatestDraw();
			} else if (method == 2) {
				XMLGregorianCalendar xmlGrCal = util.getDate(scanner);
				messageWrapper = qService.fetchLottoByDate(xmlGrCal);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
				messageWrapper = qService.fetchLottoByNumber(compNum);
			}
			break;
		case 3:
			// Joker
			if (method == 1) {
				messageWrapper = qService.fetchJokerLatestDraw();
			} else if (method == 2) {
				XMLGregorianCalendar xmlGrCal = util.getDate(scanner);
				messageWrapper = qService.fetchJokerByDate(xmlGrCal);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
				messageWrapper = qService.fetchJokerByNumber(compNum);
			}
			break;
		case 4:
			// Proto
			if (method == 1) {
				messageWrapper = qService.fetchProtoLatestDraw();
			} else if (method == 2) {
				XMLGregorianCalendar xmlGrCal = util.getDate(scanner);
				messageWrapper = qService.fetchProtoByDate(xmlGrCal);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
				messageWrapper = qService.fetchProtoByNumber(compNum);
			}
			break;
		case 5:
			// Super3
			if (method == 1) {
				messageWrapper = qService.fetchSuper3LatestDraw();
			} else if (method == 2) {
				XMLGregorianCalendar xmlGrCal = util.getDate(scanner);
				messageWrapper = qService.fetchSuper3ByDate(xmlGrCal);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
				messageWrapper = qService.fetchSuper3ByNumber(compNum);
			}
			break;
		case 6:
			// Extra5
			if (method == 1) {
				messageWrapper = qService.fetchExtra5LatestDraw();
			} else if (method == 2) {
				XMLGregorianCalendar xmlGrCal = util.getDate(scanner);
				messageWrapper = qService.fetchExtra5ByDate(xmlGrCal);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
				messageWrapper = qService.fetchExtra5ByNumber(compNum);
			}
			break;
		default:
			System.err.println("Something wrong happened!");
			break;
		}

		util.printer(messageWrapper);
	}
}

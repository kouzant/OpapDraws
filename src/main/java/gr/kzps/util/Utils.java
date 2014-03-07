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
package gr.kzps.util;

import gr.kzps.MessageWrapper;
import gr.opap.draws.ws.query.GameDraw;

import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Class with some utility methods.
 * 
 * @author Antonis Kouzoupis
 * 
 */
public class Utils {
	/**
	 * StringBuilder object
	 * 
	 * @see StringBuilder
	 */
	private StringBuilder sb;

	/**
	 * In case the user selects the get draw by date method, this method gets
	 * the date.
	 * 
	 * @param scanner The scanner object to get the user input
	 * @return Date of draw
	 * @see java.util.GregorianCalendar
	 * @see XMLGregorianCalendar
	 * @exception DatatypeConfigurationException
	 */
	public XMLGregorianCalendar getDate(Scanner scanner) {
		System.out.println("Type the desired date (DD/MM/YYYY): ");

		String sDate = scanner.next();
		String[] splitDate = sDate.split("[/]");

		GregorianCalendar gCal = new GregorianCalendar(
				Integer.parseInt(splitDate[2]),
				Integer.parseInt(splitDate[1]) - 1,
				Integer.parseInt(splitDate[0]));
		XMLGregorianCalendar xmlGrCal = null;
		try {
			xmlGrCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(
					gCal);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return xmlGrCal;
	}

	/**
	 * In case the user selects the get draw by draw number, this method gets
	 * the draw number.
	 * 
	 * @param scanner The scanner object to get the user input
	 * @return The competition number
	 */
	public Long getCompNum(Scanner scanner) {
		System.out.println("Type the desired competition number");

		Long compNum = scanner.nextLong();

		return compNum;
	}

	/**
	 * Print dashes before and after a string in order to form a box.
	 * @param length Length of the string
	 * @return The proper amount of dashes
	 * @see StringBuilder
	 */
	private String printDashes(int length) {
		sb = new StringBuilder();
		for (int i = 0; i < length; i++)
			sb.append("-");

		return sb.toString();
	}

	/**
	 * Lotto and Joker have a special number which is printed in a special way.
	 * @param numArr Array of numbers
	 * @param game The game in question
	 * @return The string of formated numbers
	 * @see StringBuilder
	 */
	private String formatNumber(List<Long> numArr, String game) {
		Iterator<Long> numArrIt = numArr.iterator();
		sb = new StringBuilder();
		sb.append("|");
		// Last node of the list is the special one
		if (Constants.LOTTO.equals(game) || Constants.JOKER.equals(game)) {
			for (int i = 0; i < (numArr.size() - 1); i++) {
				sb.append(" ").append(numArr.get(i));
			}
			sb.append(" + ").append(numArr.get(numArr.size() - 1));
		} else {
			// No special number here
			while (numArrIt.hasNext()) {
				sb.append(" ").append(numArrIt.next());
			}
		}
		sb.append(" |");

		return sb.toString();
	}

	/**
	 * Print the result of a draw.
	 * @param messageWrapper Unified message response
	 * @see MessageWrapper
	 * @see Utils#printDashes(int)
	 * @see Utils#formatNumber(List, String)
	 * @see Iterator
	 * @see GameDraw
	 */
	public void Printer(MessageWrapper messageWrapper) {
		if (messageWrapper == null) {
			System.err.println("Something wrong happened!");
			System.exit(-2);
		}
		Integer zero = new Integer(0);
		System.out.println(printDashes(messageWrapper.getGameId().length() + 2));
		System.out.println("|" + messageWrapper.getGameId() + "|");
		System.out.println(printDashes(messageWrapper.getGameId().length() + 2));
		System.out.println();

		if (zero.compareTo(messageWrapper.getGameDraws().size()) == 0
				|| null == messageWrapper.getGameDraws()) {
			System.out.println("Wrong competition number or no draws that day!");
		} else {
			Iterator<GameDraw> gDrawIt = messageWrapper.getGameDraws()
					.iterator();
			GameDraw gDraw = null;
			while (gDrawIt.hasNext()) {
				gDraw = gDrawIt.next();
				String date = gDraw.getDrawTime().toGregorianCalendar()
						.getTime().toString();
				System.out.println("Date: " + date);
				System.out.println("Competition number: " + gDraw.getDrawId());
				System.out.println("Draw:");
				String numbers = formatNumber(gDraw.getNumArr(),
						messageWrapper.getGameId());
				System.out.println(printDashes(numbers.length()));
				System.out.println(numbers);
				System.out.println(printDashes(numbers.length()));
				System.out.println();
			}
		}
	}
}

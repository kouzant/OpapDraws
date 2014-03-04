package gr.kzps.util;

import gr.kzps.MessageWrapper;
import gr.opap.draws.ws.query.GameDraw;

import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Scanner;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class Utils {
	Scanner scanner;
	StringBuilder strBld;

	public XMLGregorianCalendar getDate(Scanner scanner) {
		strBld = new StringBuilder();
		strBld.append("Type the desired date DD/MM/YYYY").append("\n");
		System.out.print(strBld.toString());

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
		System.out.println("Date: " + xmlGrCal.toGregorianCalendar().getTime().toString());
		return xmlGrCal;
	}

	public Long getCompNum(Scanner scanner) {
		strBld = new StringBuilder();
		strBld.append("Type the desired competition number").append("\n");
		System.out.print(strBld.toString());

		Long compNum = scanner.nextLong();

		return compNum;
	}

	private String printDashes(int length) {
		for (int i = 0; i < length + 2; i++)
			strBld.append("-");
		strBld.append("\n");

		return strBld.toString();
	}

	public String Printer(MessageWrapper messageWrapper) {
		if (messageWrapper == null) {
			System.err.println("Something wrong happened!");
			System.exit(-2);
		}
		Integer zero = new Integer(0);
		strBld = new StringBuilder();
		strBld.append(printDashes(messageWrapper.getGameId().length()));
		strBld.append("|").append(messageWrapper.getGameId()).append("|")
				.append("\n");
		strBld.append(printDashes(messageWrapper.getGameId().length()));
		strBld.append("\n").append("\n");

		if (zero.compareTo(messageWrapper.getGameDraws().size()) == 0
				|| null == messageWrapper.getGameDraws()) {
			strBld.append("Wrong competition number or no draws that day")
					.append("\n");
		} else {
			Iterator<GameDraw> gDrawIt = messageWrapper.getGameDraws()
					.iterator();
			GameDraw gDraw = null;
			while (gDrawIt.hasNext()) {
				gDraw = gDrawIt.next();
				String date = gDraw.getDrawTime().toGregorianCalendar()
						.getTime().toString();
				strBld.append("Date: ").append(date).append("\n");
				strBld.append("Competition number: ").append(gDraw.getDrawId())
						.append("\n");
				strBld.append("Draw: ").append(gDraw.getNumArr().toString())
						.append("\n").append("\n");
			}
		}

		return strBld.toString();
	}
}

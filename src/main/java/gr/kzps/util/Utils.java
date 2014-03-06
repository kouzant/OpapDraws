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

public class Utils {
	Scanner scanner;
	StringBuilder sb;

	public XMLGregorianCalendar getDate(Scanner scanner) {
		sb = new StringBuilder();
		sb.append("Type the desired date DD/MM/YYYY").append("\n");
		System.out.print(sb.toString());

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
		System.out.println("Date: "
				+ xmlGrCal.toGregorianCalendar().getTime().toString());
		return xmlGrCal;
	}

	public Long getCompNum(Scanner scanner) {
		sb = new StringBuilder();
		sb.append("Type the desired competition number").append("\n");
		System.out.print(sb.toString());

		Long compNum = scanner.nextLong();

		return compNum;
	}

	private String printDashes(int length) {
		sb = new StringBuilder();
		for (int i = 0; i < length + 2; i++)
			sb.append("-");

		return sb.toString();
	}

	private String formatNumber(List<Long> numArr, String game) {
		Iterator<Long> numArrIt = numArr.iterator();
		sb = new StringBuilder();
		sb.append("|");
		//Last node of the list is the special one
		if (Constants.LOTTO.equals(game) || Constants.JOKER.equals(game)) {
			for (int i = 0; i < (numArr.size() - 1); i++){
				sb.append(" ").append(numArr.get(i));
			}
			sb.append(" + ").append(numArr.get(numArr.size() - 1));
		} else {
			//No special number here
			while (numArrIt.hasNext()) {
				sb.append(" ").append(numArrIt.next());
			}
		}
		sb.append(" |");

		return sb.toString();
	}

	public void Printer(MessageWrapper messageWrapper) {
		if (messageWrapper == null) {
			System.err.println("Something wrong happened!");
			System.exit(-2);
		}
		Integer zero = new Integer(0);
		System.out.println(printDashes(messageWrapper.getGameId().length()));
		System.out.println("|" + messageWrapper.getGameId() + "|");
		System.out.println(printDashes(messageWrapper.getGameId().length()));
		System.out.println();

		if (zero.compareTo(messageWrapper.getGameDraws().size()) == 0
				|| null == messageWrapper.getGameDraws()) {
			System.out.println("Wrong competition number or no draws that day");
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
				System.out.println(printDashes(numbers.length() - 2));
				System.out.println(numbers);
				System.out.println(printDashes(numbers.length() - 2));
			}
		}
	}
}

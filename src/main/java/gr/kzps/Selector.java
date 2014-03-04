package gr.kzps;

import java.util.Scanner;

import javax.xml.datatype.XMLGregorianCalendar;

import gr.kzps.util.Constants;
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
		QueryService qService = new QueryService();
		MessageWrapper messageWrapper = null;
		
		switch (game) {
		case 1:
			// Kino
			if (method == 1) {
				messageWrapper = qService.fetchKinoLatestDraw(Constants.KINNO);
			} else if (method == 2) {
				XMLGregorianCalendar xmlGrCal = util.getDate(scanner);
				messageWrapper = qService.fetchKinoByDate(xmlGrCal, Constants.KINNO);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
				messageWrapper = qService.fetchKinoByNumber(compNum, Constants.KINNO);
			}
			break;
		case 2:
			// Lotto
			if (method == 1) {
				messageWrapper = qService.fetchLottoLatestDraw(Constants.LOTTO);
			} else if (method == 2) {
				XMLGregorianCalendar xmlGrCal = util.getDate(scanner);
				messageWrapper = qService.fetchKinoByDate(xmlGrCal, Constants.LOTTO);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
				messageWrapper = qService.fetchLottoByNumber(compNum, Constants.LOTTO);
			}
			break;
		case 3:
			// Joker
			if (method == 1) {
				messageWrapper = qService.fetchJokerLatestDraw(Constants.JOKER);
			} else if (method == 2) {
				XMLGregorianCalendar xmlGrCal = util.getDate(scanner);
				messageWrapper = qService.fetchJokerByDate(xmlGrCal, Constants.JOKER);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
				messageWrapper = qService.fetchJokerByNumber(compNum, Constants.JOKER);
			}
			break;
		case 4:
			// Proto
			if (method == 1) {
				messageWrapper = qService.fetchProtoLatestDraw(Constants.PROTO);
			} else if (method == 2) {
				XMLGregorianCalendar xmlGrCal = util.getDate(scanner);
				messageWrapper = qService.fetchProtoByDate(xmlGrCal, Constants.PROTO);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
				messageWrapper = qService.fetchProtoByNumber(compNum, Constants.PROTO);
			}
			break;
		case 5:
			// Super3
			if (method == 1) {
				messageWrapper = qService.fetchSuper3LatestDraw(Constants.SUPER3);
			} else if (method == 2) {
				XMLGregorianCalendar xmlGrCal = util.getDate(scanner);
				messageWrapper = qService.fetchSuper3ByDate(xmlGrCal, Constants.SUPER3);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
				messageWrapper = qService.fetchSuper3ByNumber(compNum, Constants.SUPER3);
			}
			break;
		case 6:
			// Extra5
			if (method == 1) {
				messageWrapper = qService.fetchExtra5LatestDraw(Constants.EXTRA5);
			} else if (method == 2) {
				XMLGregorianCalendar xmlGrCal = util.getDate(scanner);
				messageWrapper = qService.fetchExtra5ByDate(xmlGrCal, Constants.EXTRA5);
			} else if (method == 3) {
				Long compNum = util.getCompNum(scanner);
				messageWrapper = qService.fetchExtra5ByNumber(compNum, Constants.EXTRA5);
			}
			break;
		}
		
		System.out.print(util.Printer(messageWrapper));
	}
}

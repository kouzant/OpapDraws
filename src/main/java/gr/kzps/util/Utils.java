package gr.kzps.util;

import java.util.Scanner;

public class Utils {
	Scanner scanner;
	StringBuilder strBld = new StringBuilder();
	
	public Date getDate(Scanner scanner) {
		strBld.append("Type the desired date DD/MM/YYYY").append("\n");
		System.out.print(strBld.toString());
		
		String sDate = scanner.next();
		String[] splitDate = sDate.split("[/]");
		Date date = new Date(Integer.parseInt(splitDate[0]),
				Integer.parseInt(splitDate[1]), Integer.parseInt(splitDate[2]));
		
		System.out.println(date);
		
		return date;
	}
	
	public Long getCompNum(Scanner scanner) {
		strBld.append("Type the desired competition number").append("\n");
		System.out.print(strBld.toString());
		
		Long compNum = scanner.nextLong();
		System.out.println(compNum);
		
		return compNum;
	}
}

package example.stream.formatters;

import java.util.Date;



public class PrinterDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "KKJ";
		String b = "Hello";
		System.out.printf("reason: %s (noted by %s)", b, a);// s indicates
															// string %
															// indicates start
															// of a format
		String str=String.format("%1$td %1$tm %1$ty", new Date());
		System.out.printf(str);
	}

}

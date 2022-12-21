package utilities;

import java.util.Date;

public class DateString {

	public static String getCurrentDate() {
		Date d = new Date();
		System.out.println(d.toString());
		return (d.toString().replace(" ", "_").replace(":", "_"));

	}
}

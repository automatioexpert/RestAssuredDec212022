package RoughWork;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// Wed Dec 21 11:40:57 IST 2022
		Date d = new Date();
		System.out.println(d.toString());
		String updated = d.toString().replace(" ", "_").replace(":", "_");

		System.out.println(updated);
		//Wed_Dec_21_11_43_01_IST_2022
	}

}

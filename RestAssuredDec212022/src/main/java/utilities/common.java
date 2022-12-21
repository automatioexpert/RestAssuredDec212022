package utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class common {
	public static String getTimeStamp() {
		String s = DateTimeFormatter.ofPattern("MM-dd-yyyyHH:mm:ss").format(LocalDate.now());
		s = s.replace("-", "").replace(":", "");
		return s;
	}

}

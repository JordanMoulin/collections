package formatage;

import java.text.DecimalFormat;

public class StringUtils {
	public static String format (double d, String format) {
		DecimalFormat ff = new DecimalFormat(format);
		return ff.format(d);
	}
}

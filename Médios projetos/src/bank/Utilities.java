package bank;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utilities {

	static NumberFormat numberFormat = new DecimalFormat("R$ #,##0.00");
	
	
	public static String doubleToString (double value) {
		
		return numberFormat.format(value);
	}
}

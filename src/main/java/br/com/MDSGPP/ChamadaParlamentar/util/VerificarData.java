/**
 * Class: DateVerification.
 *  
 * Class that validates the date.
 */
package br.com.MDSGPP.ChamadaParlamentar.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class VerificarData {

    /**
     * This method is to validate a date, if it's not in the in the format it
     * should be, it returns false, otherwise it returns true.
     * 
     * @param data
     * @return false if give parse error in, and true if not.
     */
    public static boolean verificaData(String data) {
	final String dateFormat = "dd/MM/YYYY";

	SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
	sdf.setLenient(false);

	try {
	    Date greg = sdf.parse(data);
	} catch (ParseException e) {
	    return false;
	}
	return true;
    }
}

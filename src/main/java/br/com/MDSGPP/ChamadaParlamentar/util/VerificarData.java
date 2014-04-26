/**
 * Class: DateVerification.
 * @author Thiago Ramires Kairala
 * @author Thabata Helen Macedo Granja
 * @author Eduardo Brasil Martins
 * @author João Guilherme Santana Araruna
 * @author Nilton Cesar Campos Araruna
 * @author Rafael Fazzolino Pinto Barbosa
 * @author Bruno Contessotto Bragança Pinheiro
 * Date: march 26 2014.
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
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		sdf.setLenient(false);

		try {
			Date greg = sdf.parse(data);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}
}

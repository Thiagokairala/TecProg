/** 
 * Class: SqlInjectionException. *
 * 
 * @author Thiago Ramires Kairala
 * @author Thabata Helen Macedo Granja
 * @author Eduardo Brasil Martins
 * @author João Guilherme Santana Araruna
 * @author Nilton Cesar Campos Araruna
 * @author Rafael Fazzolino Pinto Barbosa
 * @author Bruno Contessotto Bragança Pinheiro
 * Date: march 26 2014.
 * 
 * Class that detects some bad input on the view layer of SQLinjection.
 */
package br.com.MDSGPP.ChamadaParlamentar.exception;

public final class ExceptionSqlInjection {
	/**
	 * 
	 * @param aTestar
	 * @return false or true, depending on that String variable to receive.
	 */
	public static boolean testeSqlInjection(String aTestar) {

		String DROP = "drop";
		String TRUNCATE = "truncate";
		String ASPAS = "\"";
		String ASPAS_SIMPLES = "'";
		String COMENTARIO = "--";
		String PONTO_E_VIRGULA = ";";

		if (aTestar.contains(DROP) || aTestar.contains(DROP.toUpperCase()))
			return false;
		if (aTestar.contains(TRUNCATE)
				|| aTestar.contains(TRUNCATE.toUpperCase()))
			return false;
		if (aTestar.contains(ASPAS) || aTestar.contains(ASPAS.toUpperCase()))
			return false;
		if (aTestar.contains(ASPAS_SIMPLES)
				|| aTestar.contains(ASPAS_SIMPLES.toUpperCase()))
			return false;
		if (aTestar.contains(COMENTARIO)
				|| aTestar.contains(COMENTARIO.toUpperCase()))
			return false;
		if (aTestar.contains(PONTO_E_VIRGULA)
				|| aTestar.contains(PONTO_E_VIRGULA.toUpperCase()))
			return false;

		return true;
	}
}
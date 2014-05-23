/**
 * Class: DateNotFoundException
 * 
 * Date: march 26 2014.
 * 
 * Exception that triggers the exception if the date is not found.
 */
package br.com.MDSGPP.ChamadaParlamentar.exception;

public class DataNaoEncontradaException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * If you can not find the date.
	 */
	public DataNaoEncontradaException() {
		super();
	}
}

/**
 * Class: EmptyListException.
 * 
 *Is class is the class that verify if the deputy has valid data or
 * not.
 */
package br.com.MDSGPP.ChamadaParlamentar.exception;

public class ListaVaziaException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * This exception is to verify that the deputy has valid data or not.
	 */
	public ListaVaziaException() {
		super();
	}
}

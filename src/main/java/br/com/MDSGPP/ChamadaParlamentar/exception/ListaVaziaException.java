/**
 * Class: EmptyListException.
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
 * Is class is the class that verify if the deputy has valid data or
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

/**
 * Class: DateNotFoundException
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

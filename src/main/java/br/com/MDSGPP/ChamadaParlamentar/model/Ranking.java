/**
 * Class: UpdateDataBase
 * 
 * @author Thiago Ramires Kairala
 * @author Thabata Helen Macedo Granja
 * @author Eduardo Brasil Martins
 * @author João Guilherme Santana Araruna
 * @authr Nilton Cesar Campos Araruna
 * @author Rafael Fazzolino Pinto Barbosa
 * @author Bruno Contessotto Bragança Pinheiro
 * Date: march 26 2014.
 * 
 *         Is class is the class that will hold all the attributes of Ranking.
 */
package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

public class Ranking {

	private ArrayList<Estatistica> lista = new ArrayList<Estatistica>();
	private ArrayList<Estatistica> removidos = new ArrayList<Estatistica>();
	private ArrayList<Estatistica> melhores = new ArrayList<Estatistica>();
	private ArrayList<Estatistica> piores = new ArrayList<Estatistica>();

	/**
	 * Empty constructor, only to initialize the object.
	 */
	public Ranking() {

	}

	/**
	 * Getter of list
	 * 
	 * @return an ArrayList of {@link Estatistica} containing all the deputies
	 *         witch data is not corrupted.
	 */
	public ArrayList<Estatistica> getLista() {
		return lista;
	}

	/**
	 * 
	 * @param lista
	 *            an ArryList of {@link Estatistica} containing all the deputies
	 *            witch data is not corrupted.
	 */
	public void setLista(ArrayList<Estatistica> lista) {
		this.lista = lista;
	}

	/**
	 * 
	 * @return an ArryList of {@link Estatistica} containing all the deputies
	 *         witch data is corrupted.
	 */
	public ArrayList<Estatistica> getRemovidos() {
		return removidos;
	}

	/**
	 * 
	 * @param removidos
	 *            an ArryList of {@link Estatistica} containing all the deputies
	 *            witch data is corrupted.
	 */
	public void setRemovidos(ArrayList<Estatistica> removidos) {
		this.removidos = removidos;
	}

	/**
	 * 
	 * @return an ArryList of {@link Estatistica} containing the top deputies to
	 *         provide ranking.
	 */
	public ArrayList<Estatistica> getMelhores() {
		return melhores;
	}

	/**
	 * 
	 * @param melhores
	 *            an ArryList of {@link Estatistica} containing the top deputies
	 *            to provide ranking.
	 */
	public void setMelhores(ArrayList<Estatistica> melhores) {
		this.melhores = melhores;
	}

	/**
	 * 
	 * @return an ArryList of {@link Estatistica} containing the worst deputies
	 *         to provide ranking.
	 */
	public ArrayList<Estatistica> getPiores() {
		return piores;
	}

	/**
	 * 
	 * @param piores
	 *            an ArryList of {@link Estatistica} containing the worst
	 *            deputies to provide ranking.
	 */
	public void setPiores(ArrayList<Estatistica> piores) {
		this.piores = piores;
	}
}

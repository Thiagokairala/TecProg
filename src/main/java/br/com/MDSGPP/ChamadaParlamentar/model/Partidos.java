/**
 * Class: UpdateDataBase
 * 
 * This class is the class that will hold all the attributes of the
 *political parties.
 */
package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

public class Partidos {
	private String sigla;
	private String nomePartido;
	private ArrayList<Deputados> deputadosDoPartido;
	private ArrayList<Estatistica> estatisticaDosDeputados;
	private ArrayList<Estatistica> deputadosSemDados;

	/**
	 * Getter to Name of Political Party.
	 * 
	 * @return returns a string with the Name of Political Party.
	 * 
	 */
	public String getNomePartido() {
		return nomePartido;
	}

	/**
	 * Setter to Name of Political Party.
	 * 
	 * @param nomePartido
	 *            it's an String that contains the Name of Political Party.
	 */
	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}

	/**
	 * Getter Acronym.
	 * 
	 * @return returns a string with the Acronym.
	 * 
	 */
	public String getSigla() {
		return sigla;
	}

	/**
	 * Setter to Acronym.
	 * 
	 * @param sigla
	 *            it's an String that contains the Acronym.
	 */
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	/**
	 * Getter Deputies of Political Party.
	 * 
	 * @return returns ArrayList of Deputies of Political Party.
	 * 
	 */
	public ArrayList<Deputados> getDeputadosDoPartido() {
		return deputadosDoPartido;
	}

	/**
	 * Setter to Deputies of Political Party.
	 * 
	 * @param deputadosDoPartido
	 *            it's an ArrayList that contains the Deputies of Political
	 *            Party.
	 */
	public void setDeputadosDoPartido(ArrayList<Deputados> deputadosDoPartido) {
		this.deputadosDoPartido = deputadosDoPartido;
	}

	/**
	 * Getter Statistics of Deputies.
	 * 
	 * @param estatisticaDosDeputados
	 *            it's an ArrayList that contains the Statistics of Deputies.
	 */
	public ArrayList<Estatistica> getEstatisticaDosDeputados() {
		return estatisticaDosDeputados;
	}

	/**
	 * Setter to Statistics of Deputies.
	 * 
	 * @param estatisticaDosDeputados
	 *            it's an ArrayList that contains the Statistics of Deputies.
	 */
	public void setEstatisticaDosDeputados(
			ArrayList<Estatistica> estatisticaDosDeputados) {
		this.estatisticaDosDeputados = estatisticaDosDeputados;
	}

	/**
	 * Getter Deputies without Data.
	 * 
	 * @param deputadosSemDados
	 *            it's an ArrayList that contains the Deputies without Data.
	 */
	public ArrayList<Estatistica> getDeputadosSemDados() {
		return deputadosSemDados;
	}

	/**
	 * Setter to Deputies without Data.
	 * 
	 * @param deputadosSemDados
	 *            it's an ArrayList that contains the Deputies without Data.
	 */
	public void setDeputadosSemDados(ArrayList<Estatistica> deputadosSemDados) {
		this.deputadosSemDados = deputadosSemDados;
	}
}

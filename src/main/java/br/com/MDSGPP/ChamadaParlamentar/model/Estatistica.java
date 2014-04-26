/**
 * Class: UpdateDataBase
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
 * This class is the class that will hold all the attributes of
 * Statistic.
 */
package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

public class Estatistica {

	private String nome;
	private String numeroSessao;
	private String totalSessao;
	private String porcentagem;
	private ArrayList<String> lista = new ArrayList<String>();

	/**
	 * Empty constructor, only to initialize the object.
	 */
	public Estatistica() {

	}

	/**
	 * Getter of number of sessions
	 * 
	 * @return an variable numeroSessao of {@link sessoes} containing the id of
	 *         sessions.
	 * 
	 */
	public String getNumeroSessao() {
		return numeroSessao;
	}

	/**
	 * 
	 * @param number
	 *            of sessions an variable of {@link sessoes} containing the id
	 *            of sessions.
	 * 
	 */
	public void setNumeroSessao(String numeroSessao) {
		this.numeroSessao = numeroSessao;
	}

	/**
	 * Getter of total of the sessions
	 * 
	 * @return an variable totalSessao of {@link sessoes} containing the number
	 *         of the total of sessions.
	 * 
	 */
	public String getTotalSessao() {
		return totalSessao;
	}

	/**
	 * 
	 * @param totalSessao
	 *            an variable totalSessao of {@link sessoes} containing the
	 *            number of sessions.
	 * 
	 */
	public void setTotalSessao(String totalSessao) {
		this.totalSessao = totalSessao;
	}

	/**
	 * Getter of name of the deputy
	 * 
	 * @return an variable nome of {@link deputados} containing the name of the
	 *         deputy.
	 * 
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @param nome
	 *            an variable nome of {@link deputados} containing the name of
	 *            the deputy.
	 * 
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Getter of percent of the sessions assisted
	 * 
	 * @return an variable porcentagem of {@link deputados} containing the
	 *         percent of the deputy.
	 * 
	 */
	public String getPorcentagem() {
		return porcentagem;
	}

	/**
	 * 
	 * @param porcentagem
	 *            an variable porcentagem of {@link deputados} containing the
	 *            percent of the deputy
	 * 
	 */
	public void setPorcentagem(String porcentagem) {
		this.porcentagem = porcentagem;
	}

	/**
	 * Getter of list
	 * 
	 * @return an ArrayList lista of {@link sessoes} containing all the
	 *         sessions.
	 * 
	 */
	public ArrayList<String> getLista() {
		return lista;
	}

	/**
	 * 
	 * @param list
	 *            an ArrayList lista of {@link sessoes} containing all the
	 *            sessions.
	 * 
	 */
	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}
}

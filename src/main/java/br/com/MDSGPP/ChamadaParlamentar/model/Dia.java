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
 * This class is the class that will hold all the attributes of Dia.
 */
package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.exception.DataFormatoErradoException;
import br.com.MDSGPP.ChamadaParlamentar.util.VerificarData;

public class Dia {
	private String data;
	private ArrayList<SessoesEReunioes> listaSessoes = new ArrayList<SessoesEReunioes>();
	private int numeroSessoes;

	public String getData() {
		return data;
	}

	/**
	 * Constructor of the class, it'll initialize the attribute data.
	 * 
	 * @param data
	 *            it's the date the session happened, String, format dd/MM/YYYY.
	 */
	public void setData(String data) throws DataFormatoErradoException {
		if (!VerificarData.verificaData(data)) {
			throw new DataFormatoErradoException();
		}

		this.data = data;
	}

	/**
	 * Getter of list
	 * 
	 * @return an ArrayList of {@link sessoes} containing all the sessions.
	 * 
	 */
	public ArrayList<SessoesEReunioes> getListaSessoes() {
		return listaSessoes;
	}

	/**
	 * Setter of List
	 * 
	 * @param listaSessoes
	 *            an ArryList of {@link sessoes} containing all the sessions.
	 * 
	 */
	public void setListaSessoes(ArrayList<SessoesEReunioes> listaSessoes) {
		this.listaSessoes = listaSessoes;
		if (listaSessoes != null) {
			this.numeroSessoes = listaSessoes.size();
		} else {
			this.numeroSessoes = 0;
		}
	}

	/**
	 * Getter to number of sessions
	 * 
	 * @return an ArryList of {@link sessoes} containing the number of the
	 *         sessions.
	 * 
	 */
	public int getNumeroSessoes() {
		return numeroSessoes;
	}
}

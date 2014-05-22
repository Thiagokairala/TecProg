/**
 * Class: UpdateDataBase
 * 
 * Date: march 26 2014.
 * 
 * This class is the class that will hold all the attributes of Sessions
 * and meetings.
 */
package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.exception.DataFormatoErradoException;
import br.com.MDSGPP.ChamadaParlamentar.util.VerificarData;

public class SessoesEReunioes {

    private String data;
    private String descricao;
    private String descricaoCompleta;
    private ArrayList<String> deputadosPresentes = new ArrayList<String>();

    private ArrayList<Deputados> deputados = new ArrayList<Deputados>();

    /**
     * Constructor of the class, it'll initialize all the attributes.
     * 
     * @param data
     *            it's the date the session happened, String, format dd/MM/YYYY.
     * @param descricao
     *            it's the content of the session, String
     * @param deputados
     *            all deputies, ArrayList<Deputados>.
     * @param descricaoCompleta
     *            it's the whole content, of the session, String.
     * @throws DataFormatoErradoException
     *             if the date is not valid, it'll throw an exception.
     */
    public SessoesEReunioes(String data, String descricao,
	    ArrayList<Deputados> deputados, String descricaoCompleta)
	    throws DataFormatoErradoException {

	if (!VerificarData.verificaData(data)) {
	    throw new DataFormatoErradoException();
	}

	this.data = data;
	this.descricao = descricao;
	this.deputados = deputados;
	this.descricaoCompleta = descricaoCompleta;

    }

    /**
     * empty constructor, it is only to initialize the object.
     */
    public SessoesEReunioes() {

    }

    /**
     * Getter to date.
     * 
     * @return returns a string with the date of the session.
     * 
     */
    public String getData() {
	return data;
    }

    /**
     * Setter to date
     * 
     * @param data
     *            String when the session happened on the format dd/MM/YYYY.
     * @throws DataFormatoErradoException
     *             if the date is not on the right format it throws an
     *             aexception
     */
    public void setData(String data) throws DataFormatoErradoException {
	if (!VerificarData.verificaData(data)) {
	    throw new DataFormatoErradoException();
	}

	this.data = data;
    }

    /**
     * Getter to description
     * 
     * @return returns the attribute description.
     */
    public String getDescricao() {
	return descricao;
    }

    /**
     * Setter to description
     * 
     * @param descricao
     *            it's an String that contains the description of the session.
     */
    public void setDescricao(String descricao) {
	this.descricao = descricao;
    }

    /**
     * getter to deputies.
     * 
     * @return returns an ArrayList with all the deputies.
     */
    public ArrayList<Deputados> getDeputados() {
	return deputados;
    }

    /**
     * Setter to deputies.
     * 
     * @param deputados
     *            ArrayList of deputies.
     */
    public void setDeputados(ArrayList<Deputados> deputados) {
	this.deputados = deputados;
    }

    /**
     * Getter of fullDescription.
     * 
     * @return its returns the full description of the session on a String.
     */
    public String getDescricaoCompleta() {
	return descricaoCompleta;
    }

    /**
     * Setter of fullDescription.
     * 
     * @param descricaoCompleta
     *            returns a string containing the full description of the
     *            session.
     */
    public void setDescricaoCompleta(String descricaoCompleta) {
	this.descricaoCompleta = descricaoCompleta;
    }

    /**
     * Getter of presentDeputies.
     * 
     * @return return an ArrayList of String containing the name of the present
     *         deputies.
     */
    public ArrayList<String> getDeputadosPresentes() {
	return deputadosPresentes;
    }

    /**
     * Setter of presentDeputies.
     * 
     * @param deputadosPresentes
     *            its an ArrayList of String containing the name of the deputies
     *            that were present on the session.
     */
    public void setDeputadosPresentes(ArrayList<String> deputadosPresentes) {
	this.deputadosPresentes = deputadosPresentes;
    }
}

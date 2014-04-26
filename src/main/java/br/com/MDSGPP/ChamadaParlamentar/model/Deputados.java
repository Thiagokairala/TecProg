/**
 * Class: UpdateDataBase
 * @author Thiago Ramires Kairala
 * @author Thabata Helen Macedo Granja
 * @author Eduardo Brasil Martins
 * @author João Guilherme Santana Araruna
 * @author Nilton Cesar Campos Araruna
 * @author Rafael Fazzolino Pinto Barbosa
 * @author Bruno Contessotto Bragança Pinheiro
 * Date: march 26 2014.
 * 
 * This class is the class that will hold all the attributes of Deputies.
 */
package br.com.MDSGPP.ChamadaParlamentar.model;

public class Deputados {

	private int deputyId;
	private int matricula;
	private int ideCadastro;
	private String nomeCivilDoParlamentar;
	private String nomeDeTratamentoDoParlamentar;
	private String sexo;
	private String uf;
	private String partido;
	private String numeroDoGabinete;
	private String anexo;
	private String telefone;
	private String email;

	/**
	 * Empty constructor only to initializate the object.
	 */
	public Deputados() {

	}

	/**
	 * Constructor of the class to initialize all the attributes.
	 * 
	 * @param idParlamentar
	 * @param matricula
	 * @param ideCadastro
	 * @param nomeCivil
	 * @param nomeTratamento
	 * @param sexo
	 * @param uf
	 * @param partido
	 * @param numeroGabinete
	 * @param anexo
	 * @param telefone
	 * @param email
	 */
	public Deputados(int idParlamentar, int matricula, int ideCadastro,
			String nomeCivil, String nomeTratamento, String sexo, String uf,
			String partido, String numeroGabinete, String anexo,
			String telefone, String email) {

		this.deputyId = idParlamentar;
		this.matricula = matricula;
		this.ideCadastro = ideCadastro;
		this.nomeCivilDoParlamentar = nomeCivil;
		this.nomeDeTratamentoDoParlamentar = nomeTratamento;
		this.sexo = sexo;
		this.uf = uf;
		this.partido = partido;
		this.numeroDoGabinete = numeroGabinete;
		this.anexo = anexo;
		this.telefone = telefone;
		this.email = email;
	}

	/**
	 * Getter of deputyId.
	 * 
	 * @return returns an unique integer that identifies the deputy.
	 */
	public int getIdDoParlamentar() {
		return deputyId;
	}

	/**
	 * Setter of deputyId.
	 * 
	 * @param idDoParlamentar
	 */
	public void setIdDoParlamentar(int idDoParlamentar) {
		this.deputyId = idDoParlamentar;
	}

	/**
	 * Getter deputyCivilName.
	 * 
	 * @return returns a String that is the birth name of the deputy.
	 */
	public String getNomeCivilDoParlamentar() {
		return nomeCivilDoParlamentar;
	}

	/**
	 * Setter of deputyCivilName.
	 * 
	 * @param nomeCivilDoParlamentar
	 *            String, contains the birth name of the deputy.
	 */
	public void setNomeCivilDoParlamentar(String nomeCivilDoParlamentar) {
		this.nomeCivilDoParlamentar = nomeCivilDoParlamentar;
	}

	/**
	 * Getter of deputyTreatmentName.
	 * 
	 * @return returns a String containing the deputyTreatmentName.
	 */
	public String getNomeDeTratamentoDoParlamentar() {
		return nomeDeTratamentoDoParlamentar;
	}

	/**
	 * Setter of deputyTreatmentName.
	 * 
	 * @param nomeDeTratamentoDoParlamentar
	 *            String, that is the deputyTreatmentName.
	 */
	public void setNomeDeTratamentoDoParlamentar(
			String nomeDeTratamentoDoParlamentar) {
		this.nomeDeTratamentoDoParlamentar = nomeDeTratamentoDoParlamentar;
	}

	/**
	 * Getter sex.
	 * 
	 * @return returns a String containing the sex of the deputy.
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * Setter sex.
	 * 
	 * @param sexo
	 *            String, containing the sex of the deputy.
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * Getter state.
	 * 
	 * @return a String containing the state of the deputy.
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * Setter state
	 * 
	 * @param uf
	 *            String, containing the state of the deputy.
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * Getter politicalParty.
	 * 
	 * @return returns the policalParty of the deputy.
	 */
	public String getPartido() {
		return partido;
	}

	/**
	 * Setter politicalParty.
	 * 
	 * @param partido
	 *            String, it's the politicalParty of the deputy.
	 */
	public void setPartido(String partido) {
		this.partido = partido;
	}

	/**
	 * Getter cabinetNumber.
	 * 
	 * @return returns the cabinetNumber of the deputy.
	 */
	public String getNumeroDoGabinete() {
		return numeroDoGabinete;
	}

	/**
	 * Setter cabinetNumber.
	 * 
	 * @param cabinet
	 *            String, it's the cabinetNumber of the deputy.
	 */
	public void setNumeroDoGabinete(String numeroDoGabinete) {
		this.numeroDoGabinete = numeroDoGabinete;
	}

	/**
	 * Getter building.
	 * 
	 * @return returns the building of the cabinet.
	 */
	public String getAnexo() {
		return anexo;
	}

	/**
	 * Setter building.
	 * 
	 * @param building
	 *            String, it's the building of the cabinet.
	 */
	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

	/**
	 * Getter phone.
	 * 
	 * @return returns the phone of the cabinet.
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * Setter phone.
	 * 
	 * @param phone
	 *            String, it's the phone of the cabinet.
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Getter email.
	 * 
	 * @return returns the email of the deputy.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter email.
	 * 
	 * @param email
	 *            String, it's the email of the deputy.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Getter registration.
	 * 
	 * @return returns the registration of the deputy.
	 */
	public int getMatricula() {
		return matricula;
	}

	/**
	 * Setter registration.
	 * 
	 * @param matricula
	 *            integer, it's the registration of the deputy.
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	/**
	 * Getter cadastreId.
	 * 
	 * @return returns the cadastreId of the deputy.
	 */
	public int getIdeCadastro() {
		return ideCadastro;
	}

	/**
	 * Setter cadastreId.
	 * 
	 * @param cadastreId
	 *            , it's the cadastreId of the deputy
	 */
	public void setIdeCadastro(int ideCadastro) {
		this.ideCadastro = ideCadastro;
	}
}

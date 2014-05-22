/**
 * Class: DayDao
 * Date: march 26 2014.
 * 
 * License: This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This class is to connect the system to the tables sessions and date of the database
 * in order to gather information of one specific day.
 */
package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.exception.DataFormatoErradoException;
import br.com.MDSGPP.ChamadaParlamentar.model.Dia;
import br.com.MDSGPP.ChamadaParlamentar.model.SessoesEReunioes;

public class DiaDao extends ConnectionFactory {
	
	private final static int zero = 0;
	private static final String DATAS = "datas";

	public DiaDao() throws ClassNotFoundException, SQLException {
		new ConnectionFactory().getConnection();
	}

	/**
	 * Method that creates a list of all sessions of the day.
	 * 
	 * @return a list containing all days.
	 * @throws SQLException
	 *             if miss spelled SQL is entered.
	 * @throws DataFormatoErradoException
	 *             if the date comes with some error.
	 */
	public ArrayList<Dia> buscarTodasDescricoes() throws SQLException,
			DataFormatoErradoException {
		ArrayList<Dia> lista = new ArrayList<Dia>();
		String sql = "Select * from datas";

		PreparedStatement stmt = ConnectionFactory.getConexao()
				.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		lista = criarDias(rs);

		ResultSet rs2 = stmt.executeQuery();

		lista = popularListaDia(rs2, lista);

		rs.close();
		return lista;
	}

	/**
	 * Method that populates the list of all sessions on the day.
	 * 
	 * @param rs
	 *            is the variable that moves the cursor to the next step.
	 * @param lista
	 *            is the ArrayList that is populated
	 * @return an ArrayList with all sessions on the day.
	 * @throws SQLException
	 *             if miss spelled SQL is entered.
	 */
	public static ArrayList<Dia> popularListaDia(ResultSet rs,
			ArrayList<Dia> lista) throws SQLException {
		int cont = zero;

		while (rs.next()) {
			String descricao = rs.getString("sessao");
			String descAux = descricao;
			descricao = descricao.split(" -")[zero];

			boolean teste = lista.get(cont).getData()
					.equalsIgnoreCase(rs.getString(DATAS));

			// esse if é igual if(teste == false)
			if (!teste) {
				cont++;
			}
			SessoesEReunioes passar = new SessoesEReunioes();
			passar.setDescricao(descricao);
			passar.setDescricaoCompleta(descAux);
			lista.get(cont).getListaSessoes().add(passar);
		}

		rs.close();
		return lista;
	}

	/**
	 * Method that creates day.
	 * 
	 * @param rs
	 *            is the variable that moves the cursor to the next step.
	 * @return all days created.
	 * @throws SQLException
	 *             if miss spelled SQL is entered.
	 * @throws DataFormatoErradoException
	 *             if the date comes with some error.
	 */
	public static ArrayList<Dia> criarDias(ResultSet rs) throws SQLException,
			DataFormatoErradoException {
		ArrayList<Dia> lista = new ArrayList<Dia>();

		int controle = zero;

		while (rs.next()) {
			if (lista.size() == zero) {
				Dia dia = new Dia();
				dia.setData(rs.getString(DATAS));
				lista.add(dia);
			} else {
				boolean teste = lista.get(controle).getData()
						.equals(rs.getString(DATAS));
				if (!teste) {
					Dia diaAux = new Dia();
					diaAux.setData(rs.getString(DATAS));
					lista.add(diaAux);
					controle++;
				}
			}
		}

		rs.close();
		return lista;
	}

}

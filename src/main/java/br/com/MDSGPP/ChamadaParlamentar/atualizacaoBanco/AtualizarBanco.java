/**
 * Class: UpdateDataBase
 
 * Date: march 26 2014.
 * 
 * License: This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This class is the class that is going to update the data base with
 * the data provided from the deputy chamber, every day at 6 AM.
 */
package br.com.MDSGPP.ChamadaParlamentar.atualizacaoBanco;

import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.xml.rpc.ServiceException;

import br.com.MDSGPP.ChamadaParlamentar.classesDeConexao.ConexaoComWsSessoesEReunioes;
import br.com.MDSGPP.ChamadaParlamentar.control.RankingControl;
import br.com.MDSGPP.ChamadaParlamentar.dao.Dao;
import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.dao.RankingDao;
import br.com.MDSGPP.ChamadaParlamentar.dao.SessoesEReunioesDao;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaRankingException;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaVaziaException;
import br.com.MDSGPP.ChamadaParlamentar.model.Ranking;

public class AtualizarBanco {
    Timer timer;

    /**
     * Method to start the execution of tasks.
     */
    public AtualizarBanco() {

	timer = new Timer();
	// Executa tarefa todo dia as 6 da manha
	System.out.println("ENTROU INICIAR");
	timer.schedule(new tarefasDiarias(), getAmanha6Am(), delayDiario);
    }

    private final static long delayDiario = 1000 * 60 * 60 * 24;
    private final static int fONE_DAY = 1;
    private final static int fFOUR_AM = 6;
    private final static int fZERO_MINUTES = 00;

    private final static String deputyId = "440";
    private final static String dateToUpdateFrom = "20/11/2011";

    /**
     * 
     * The date of the last updated
     * 
     * @return the date of the last updated
     */
    private static Date getAmanha6Am() {
	System.out.println("entrou");
	Calendar tomorrow = new GregorianCalendar();
	tomorrow.add(Calendar.DATE, fONE_DAY);
	Calendar result = new GregorianCalendar(tomorrow.get(Calendar.YEAR),
		tomorrow.get(Calendar.MONTH), tomorrow.get(Calendar.DATE),
		fFOUR_AM, fZERO_MINUTES);

	Date time = result.getTime();

	return time;
    }

    public static void main(String[] args) {
	new AtualizarBanco();
    }

    /**
     * Method to stop the execution of tasks.
     */
    public void parar() {
	timer.cancel();
    }

    /**
     * Method that contains the scheduled tasks that will be performed.
     */
    class tarefasDiarias extends TimerTask {
	public void run() {
	    try {
		System.out.println("teste");
		Dao.truncateTables();

		SessoesEReunioesDao sessoesDao = new SessoesEReunioesDao();

		sessoesDao.adcionarDataNaTable(ConexaoComWsSessoesEReunioes
			.adcionarDataNaTable(dateToUpdateFrom, deputyId));
		sessoesDao.adcionarSessaoNaTable(ConexaoComWsSessoesEReunioes
			.adcionarSessaoNaTable(dateToUpdateFrom));
		RankingDao rankingDao = new RankingDao();
		Ranking ranking = RankingControl
			.gerarRanking(RankingControl
				.gerarListaEstatistica(new DeputadoDao()
					.getDeputados()));

		rankingDao.adicionarRankingNaTable(ranking);
	    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (ServiceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (ListaRankingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (ListaVaziaException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
    }
}
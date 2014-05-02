package br.com.MDSGPP.ChamadaParlamentar.internalization;

import java.util.ListResourceBundle;

public class Internalization_Pt extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return contents;
	}

	static final Object[][] contents = {
			/**
			 * translates for header.
			 */
			{ "menu.Home", "P�gina Inicial" },

			{ "menu.Deputys", "Deputados" },
			{ "menu.TrackDeputy", "Procurar deputado" },

			{ "menu.Partido", "Partido" },
			{ "menu.TrackParty", "Procurar partido" },

			{ "menu.Sess�es", "Sess�es" },
			{ "menu.TrackSession", "Track Session" },

			{ "menu.Ranking", "Ranking" },
			{ "menu.RankingTop5", "5 melhores do Ranking" },
			{ "menu.CompleteRanking", "Ranking Completo" },

			{ "TrackDeputy.InsertDeputysName", "Digite o nome do deputado" },

			{ "TrackParty.InsertPartysName", "Digite o nome do partido" },

			{ "DataNotAvailable.SearchOtherDeputys",
					"Procurar outros deputados" },
			{ "DataNotAvailable.click", "Clique" },
			{ "DataNotAvailable.Here", "aqui" },
			{ "DataNotAvailable.NoData",
					"Desculpe, os dados para este deputado n�o est�o dispon�veis." },

			{ "TrackSession.InsertDay", "Digite o dia" },
			{ "TrackSession.Page", "P�gina" },
			{ "TrackSession.Date", "Data" },

			{ "DateNotFound.DateNotFound", "Data n�o encontrada." },
			{ "DateNotFound.TryAgain", "Deseja tentar novamente?" },

			{ "DeputyNotFound.DeputyNotFound", "Deputado n�o encontrado!" },
			{ "DeputyNotFound.TryAgain", "Deseja tentar novamente?" },

			{ "Error.CorrectedError", "Desculpe, esse erro ser� corrigido." },

			{ "Footer.WhoWeAre", "Quem n�s somos" },
			{ "Error.CorrectedError", "Desculpe, esse erro ser� corrigido." },

			{ "WrongFormat.WrongDate",
					"Desculpe, mas a data que voc� digitou est� incorreta." },

			{ "ShowComparisonDeputy.Name", "Nome:" },
			{ "ShowComparisonDeputy.SessionsWhatched", "Sess�es Assistidas:" },
			{ "ShowComparisonDeputy.TotalNumberSessions", "N�mero de sess�es:" },
			{ "ShowComparisonDeputy.Percent", "Percentual:" },
			{ "ShowComparisonDeputy.Sessions", "Sess�es:" },

			{ "ShowDay.Session", "Sess�o:" },
			{ "ShowDay.Sessions", "Sess�es:" },

			{ "ShowEstatistic.Name", "Nome:" },
			{ "ShowEstatistic.SessionsWhatched", "Sess�es assistidas:" },
			{ "ShowEstatistic.TotalNumberSessions", "N�mero de sess�es:" },
			{ "ShowEstatistic.Percent", "Percentual:" },
			{ "ShowEstatistic.Sessions", "Sess�es:" },
			{ "ShowEstatistic.ask", "Deseja comparar este deputado com outro?" },

			{ "ShowParty.PresenceAvarege", "M�dia de presen�a:" },

			{ "PartyNotFound.warning", "Partido n�o encontrado!" },
			{ "PartyNotFound.tryAgain", "Deseja tentar novamente?" },

			{ "WhoWeAre.WhoWeAre", "Quem n�s somos:" },
			{ "WhoWeAre.WeAre",
					"N�s somos estudantes de Engenharia de Software da Universidade de Bras�lia" },
			{ "WhoWeAre.Members", "Membros:" },
			{ "WhoWeAre.MDS", "M�todos de Desenvolvimento de Software:" },
			{ "WhoWeAre.GPP", "Gest�o de Portif�lios e Projetos de Software:" },

			{ "RankingDeputy.ranking", "Ranking dos Deputados:" },
			{ "RankingDeputy.TheFiveMore", "Os cinco mais presentes" },
			{ "RankingDeputy.TheFiveless", "Os cinco menos presentes" },
			{ "RankingDeputy.NotAvaliable", "Deputados sem dados dispon�veis:" },

			{ "CompleteRanking.DeputyRanking", "Ranking dos Deputados:" },
			{ "CompleteRanking.DeputyNoData",
					"Deputados sem dados dispon�veis:" },

			{ "DeputyPresents.Title", "Deputados Presentes" },

			{ "SQLDetect.Stupid", "Desculpe, mas n�o somos idiotas =D" },
			{ "SQLDetect.BeGood", "Voc� promete ser legal??" },
			{ "SQLDetect.Yes", "Sim!!" },
			{ "SQLDetect.No", "N�o!!" },

			{ "index.openData", "A lei dos dados abertos" },
			{
					"index.firstParagraph",
					"Segundo a defini��o da Open Knowledge Foundation, em suma dados s�o abertos "
							+ "quando qualquer pessoa pode livremente us�-los, reutiliz�-los e redistribu�-los, estando sujeito a, "
							+ "no m�ximo, a exig�ncia de creditar a sua autoria e compartilhar a mesma licen�a. "
							+ "Isso Geralmente � satisfeito pela publica��o dos dados em formato aberto e sob uma licen�a aberta." },

			{ "index.secondParagraph",
					"Os dados abertos tamb�m s�o pautados pelas tr�s leis e oito princ�pios." },
			{
					"index.thirdParagraph",
					"As tr�s leis:<br>O especialista em pol�ticas p�blicas e ativista dos dados abertos "
							+ "David Eaves<br> prop�s as seguintes \"leis\":<br> Se o dado n�o pode ser encontrado e indexado na Web, "
							+ "ele n�o existe<br> Se n�o estiver aberto e dispon�vel em formato compreens�vel por m�quina, <br> ele n�o pode ser "
							+ "reaproveitado; <br> Se algum dispositivo legal nao permitir sua replica��o, ele nao � �til<br> As leis foram propostas "
							+ "para os Dados Abertos Governamentais, mas<br> pode-se dizer que elas se aplicam aos Dados Abertos de forma geral." },

	};

}

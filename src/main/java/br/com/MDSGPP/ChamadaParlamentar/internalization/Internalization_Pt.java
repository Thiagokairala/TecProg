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
			{ "menu.Home", "Página Inicial" },

			{ "menu.Deputys", "Deputados" },
			{ "menu.TrackDeputy", "Procurar deputado" },

			{ "menu.Partido", "Partido" },
			{ "menu.TrackParty", "Procurar partido" },

			{ "menu.Sessões", "Sessões" },
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
					"Desculpe, os dados para este deputado não estão disponíveis." },

			{ "TrackSession.InsertDay", "Digite o dia" },
			{ "TrackSession.Page", "Página" },
			{ "TrackSession.Date", "Data" },

			{ "DateNotFound.DateNotFound", "Data não encontrada." },
			{ "DateNotFound.TryAgain", "Deseja tentar novamente?" },

			{ "DeputyNotFound.DeputyNotFound", "Deputado não encontrado!" },
			{ "DeputyNotFound.TryAgain", "Deseja tentar novamente?" },

			{ "Error.CorrectedError", "Desculpe, esse erro será corrigido." },

			{ "Footer.WhoWeAre", "Quem nós somos" },
			{ "Error.CorrectedError", "Desculpe, esse erro será corrigido." },

			{ "WrongFormat.WrongDate",
					"Desculpe, mas a data que você digitou está incorreta." },

			{ "ShowComparisonDeputy.Name", "Nome:" },
			{ "ShowComparisonDeputy.SessionsWhatched", "Sessões Assistidas:" },
			{ "ShowComparisonDeputy.TotalNumberSessions", "Número de sessões:" },
			{ "ShowComparisonDeputy.Percent", "Percentual:" },
			{ "ShowComparisonDeputy.Sessions", "Sessões:" },

			{ "ShowDay.Session", "Sessão:" },
			{ "ShowDay.Sessions", "Sessões:" },

			{ "ShowEstatistic.Name", "Nome:" },
			{ "ShowEstatistic.SessionsWhatched", "Sessões assistidas:" },
			{ "ShowEstatistic.TotalNumberSessions", "Número de sessões:" },
			{ "ShowEstatistic.Percent", "Percentual:" },
			{ "ShowEstatistic.Sessions", "Sessões:" },
			{ "ShowEstatistic.ask", "Deseja comparar este deputado com outro?" },

			{ "ShowParty.PresenceAvarege", "Média de presença:" },

			{ "PartyNotFound.warning", "Partido não encontrado!" },
			{ "PartyNotFound.tryAgain", "Deseja tentar novamente?" },

			{ "WhoWeAre.WhoWeAre", "Quem nós somos:" },
			{ "WhoWeAre.WeAre",
					"Nós somos estudantes de Engenharia de Software da Universidade de Brasília" },
			{ "WhoWeAre.Members", "Membros:" },
			{ "WhoWeAre.MDS", "Métodos de Desenvolvimento de Software:" },
			{ "WhoWeAre.GPP", "Gestão de Portifólios e Projetos de Software:" },

			{ "RankingDeputy.ranking", "Ranking dos Deputados:" },
			{ "RankingDeputy.TheFiveMore", "Os cinco mais presentes" },
			{ "RankingDeputy.TheFiveless", "Os cinco menos presentes" },
			{ "RankingDeputy.NotAvaliable", "Deputados sem dados disponíveis:" },

			{ "CompleteRanking.DeputyRanking", "Ranking dos Deputados:" },
			{ "CompleteRanking.DeputyNoData",
					"Deputados sem dados disponíveis:" },

			{ "DeputyPresents.Title", "Deputados Presentes" },

			{ "SQLDetect.Stupid", "Desculpe, mas não somos idiotas =D" },
			{ "SQLDetect.BeGood", "Você promete ser legal??" },
			{ "SQLDetect.Yes", "Sim!!" }, { "SQLDetect.No", "Não!!" },

	};

}

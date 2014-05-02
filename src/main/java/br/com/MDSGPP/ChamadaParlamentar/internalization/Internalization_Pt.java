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
			{ "SQLDetect.Yes", "Sim!!" },
			{ "SQLDetect.No", "Não!!" },

			{ "index.openData", "A lei dos dados abertos" },
			{
					"index.firstParagraph",
					"Segundo a definição da Open Knowledge Foundation, em suma dados são abertos "
							+ "quando qualquer pessoa pode livremente usá-los, reutilizá-los e redistribuí-los, estando sujeito a, "
							+ "no máximo, a exigência de creditar a sua autoria e compartilhar a mesma licença. "
							+ "Isso Geralmente é satisfeito pela publicação dos dados em formato aberto e sob uma licença aberta." },

			{ "index.secondParagraph",
					"Os dados abertos também são pautados pelas três leis e oito princípios." },
			{
					"index.thirdParagraph",
					"As três leis:<br>O especialista em políticas públicas e ativista dos dados abertos "
							+ "David Eaves<br> propôs as seguintes \"leis\":<br> Se o dado não pode ser encontrado e indexado na Web, "
							+ "ele não existe<br> Se não estiver aberto e disponível em formato compreensível por máquina, <br> ele não pode ser "
							+ "reaproveitado; <br> Se algum dispositivo legal nao permitir sua replicação, ele nao é útil<br> As leis foram propostas "
							+ "para os Dados Abertos Governamentais, mas<br> pode-se dizer que elas se aplicam aos Dados Abertos de forma geral." },

	};

}

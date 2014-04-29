package br.com.MDSGPP.ChamadaParlamentar.internalization;

import java.util.ListResourceBundle;

public class Internalization_Fr extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return contents;
	}

	static final Object[][] contents = {
			/**
			 * translates for header.
			 */
			{ "menu.Home", "D�but" },

			{ "menu.Deputys", "D�put�s" },
			{ "menu.TrackDeputy", "ChercherD�put�" },

			{ "menu.Party", "PartiPolitique" },
			{ "menu.TrackParty", "ChercherPartiPolitique" },

			{ "menu.Sessions", "Sessions" },
			{ "menu.TrackSession", "Chercher Session" },

			{ "menu.Ranking", "Classement" },
			{ "menu.RankingTop5", "Top 5 Classement" },
			{ "menu.CompleteRanking", "ClassementComplet" },

			{ "TrackDeputy.InsertDeputysName", "Entrezlenomdud�put�" },

			{ "TrackParty.InsertPartysName", "Entrezlenomdu parti politique." },

			{ "DataNotAvailable.SearchOtherDeputys",
					"� larecherche d'autresd�put�s." },
			{ "DataNotAvailable.click", "Clic" },
			{ "DataNotAvailable.Here", "ici" },
			{ "DataNotAvailable.NoData",
					"D�sol�lesdonn�espourced�put� n'est pasdisponible." },

			{ "TrackSession.InsertDay", "Entrez le jour" },
			{ "TrackSession.Page", "Page" },
			{ "TrackSession.Date", "Date" },

			{ "DateNotFound.DateNotFound", "Date non trouv�" },
			{ "DateNotFound.TryAgain", "Voulez-vous essayer � nouveau?" },

			{ "DeputyNotFound.DeputyNotFound", "D�put� non trouv�!" },
			{ "DeputyNotFound.TryAgain", "Voulez-vous essayer � nouveau?" },

			{ "Error.CorrectedError", "D�sol�, cetteerreur sera corrig�e." },

			{ "Footer.WhoWeAre", "Qui nous sommes" },
			{ "Error.CorrectedError", "D�sol�, cetteerreurseracorrig�e." },

			{ "WrongFormat.WrongDate",
					"D�sol�, mais la date indiqu�e n'est pascorrecte." },

			{ "ShowComparisonDeputy.Name", "Nom:" },
			{ "ShowComparisonDeputy.SessionsWhatched", "Sessions Regard�:" },
			{ "ShowComparisonDeputy.TotalNumberSessions", "Nombre of sessions:" },
			{ "ShowComparisonDeputy.Percent", "Pour cent:" },
			{ "ShowComparisonDeputy.Sessions", "Sessions:" },

			{ "ShowDay.Session", "Session:" },
			{ "ShowDay.Sessions", "Sessions:" },

			{ "ShowEstatistic.Name", "Nom:" },
			{ "ShowEstatistic.SessionsWhatched", "Sessions R�gard�:" },
			{ "ShowEstatistic.TotalNumberSessions", "Number of sessions:" },
			{ "ShowEstatistic.Percent", "Pour cent:" },
			{ "ShowEstatistic.Sessions", "Sessions:" },
			{ "ShowEstatistic.ask", "Voulez-vous comparer avec d'autresd�put�?" },

			{ "ShowParty.PresenceAvarege", "Moyenne de Pr�sence:" },

			{ "PartyNotFound.warning", "Partipolitique nontrouv�!" },
			{ "PartyNotFound.tryAgain", "Voulez-vous essayer � nouveau?" },

			{ "WhoWeAre.WhoWeAre", "Qui Nous Sommes:" },
			{ "WhoWeAre.WeAre",
					"Noussommesdes�tudiants de g�nielogiciel � l'Universit� de Brasilia" },
			{ "WhoWeAre.Members", "Membres:" },
			{ "WhoWeAre.MDS", "D�veloppement des m�thodes de logiciel:" },
			{ "WhoWeAre.GPP", "Projet et Portefeuille de Gestion de Logiciel:" },

			{ "RankingDeputy.ranking", "ClassementD�put�:" },
			{ "RankingDeputy.TheFiveMore", "Les CinqPlus Pr�sente" },
			{ "RankingDeputy.TheFiveless", "Les CinqMoinsPr�sente" },
			{ "RankingDeputy.NotAvaliable",
					"Les donn�es pour ced�put�n'est pas disponible" },

			{ "CompleteRanking.DeputyRanking", "Classement du D�put�:" },
			{ "CompleteRanking.DeputyNoData",
					"Les donn�es pour ced�put�n'est pas disponible:" },

			{ "DeputyPresents.Title", "D�put�sPr�sentes" },

			{ "SQLDetect.Stupid", "D�sol�, mais nous ne sommespasstupides=D" },
			{ "SQLDetect.BeGood", "Promettez-vous�tre bon??" },
			{ "SQLDetect.Yes", "Oui!!" }, { "SQLDetect.No", "Non!!" },

	};

}

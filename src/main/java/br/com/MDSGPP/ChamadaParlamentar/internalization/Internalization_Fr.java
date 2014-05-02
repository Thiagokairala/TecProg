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
			{ "menu.TrackDeputy", "Chercher D�put�" },

			{ "menu.Party", "Parti Politique" },
			{ "menu.TrackParty", "Chercher Parti Politique" },

			{ "menu.Sessions", "Sessions" },
			{ "menu.TrackSession", "Chercher Session" },

			{ "menu.Ranking", "Classement" },
			{ "menu.RankingTop5", "Top 5 Classement" },
			{ "menu.CompleteRanking", "Classement Complet" },

			{ "TrackDeputy.InsertDeputysName", "Entrez le nom du d�put�" },

			{ "TrackParty.InsertPartysName", "Entrez le nom du parti politique." },

			{ "DataNotAvailable.SearchOtherDeputys",
					"� la recherche d'autresd�put�s." },
			{ "DataNotAvailable.click", "Clic" },
			{ "DataNotAvailable.Here", "ici" },
			{ "DataNotAvailable.NoData",
					"D�sol� les don n�es pour ce d�put� n'est pas disponible." },

			{ "TrackSession.InsertDay", "Entrez le jour" },
			{ "TrackSession.Page", "Page" },
			{ "TrackSession.Date", "Date" },

			{ "DateNotFound.DateNotFound", "Date non trouv�" },
			{ "DateNotFound.TryAgain", "Voulez-vous essayer � nouveau?" },

			{ "DeputyNotFound.DeputyNotFound", "D�put� non trouv�!" },
			{ "DeputyNotFound.TryAgain", "Voulez-vous essayer � nouveau?" },

			{ "Error.CorrectedError", "D�sol�, cetteerreur sera corrig�e." },

			{ "Footer.WhoWeAre", "Qui nous sommes" },
			{ "Error.CorrectedError", "D�sol�, cet te erreur ser a corrig�e." },

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

			{ "index.openData", "Open data law" },
			{ "index.firstParagraph", "According to the definition from the Open Knowledge Foundation, the data are open when anyone"+
                    " can use it freely, re-use it and share them, being this one, at maximum, the demand of tell where he got the data from,"+
                    " and keeping the license. That's usually satisfied by publishing the data on open format and open license."}

            { "index.secondParagraph", "The open data are laid about three basic laws and eight principals."}
            { "index.thirdParagraph", "The three laws:<br>The specialist at public policy and activist of open data "+
                "David Eaves<br> proposed the following \"laws\":<br> If the data can not be found and indexed in the Web, it does not exist;"
                "<br> If not already open and available in a machine readable format, it can not be reused;"+
                "<br> If any legal provision does not permit its replication, it is not useful;<br> The laws were proposed for Open Government Data, "+
                "but you can say that they apply to Open Data in general. "},

	};

}

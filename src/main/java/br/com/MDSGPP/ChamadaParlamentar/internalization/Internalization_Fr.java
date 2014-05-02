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
			{ "menu.Home", "Début" },

			{ "menu.Deputys", "Députés" },
			{ "menu.TrackDeputy", "Chercher Député" },

			{ "menu.Party", "Parti Politique" },
			{ "menu.TrackParty", "Chercher Parti Politique" },

			{ "menu.Sessions", "Sessions" },
			{ "menu.TrackSession", "Chercher Session" },

			{ "menu.Ranking", "Classement" },
			{ "menu.RankingTop5", "Top 5 Classement" },
			{ "menu.CompleteRanking", "Classement Complet" },

			{ "TrackDeputy.InsertDeputysName", "Entrez le nom du député" },

			{ "TrackParty.InsertPartysName", "Entrez le nom du parti politique." },

			{ "DataNotAvailable.SearchOtherDeputys",
					"à la recherche d'autresdéputés." },
			{ "DataNotAvailable.click", "Clic" },
			{ "DataNotAvailable.Here", "ici" },
			{ "DataNotAvailable.NoData",
					"Désolé les don nées pour ce député n'est pas disponible." },

			{ "TrackSession.InsertDay", "Entrez le jour" },
			{ "TrackSession.Page", "Page" },
			{ "TrackSession.Date", "Date" },

			{ "DateNotFound.DateNotFound", "Date non trouvé" },
			{ "DateNotFound.TryAgain", "Voulez-vous essayer à nouveau?" },

			{ "DeputyNotFound.DeputyNotFound", "Député non trouvé!" },
			{ "DeputyNotFound.TryAgain", "Voulez-vous essayer à nouveau?" },

			{ "Error.CorrectedError", "Désolé, cetteerreur sera corrigée." },

			{ "Footer.WhoWeAre", "Qui nous sommes" },
			{ "Error.CorrectedError", "Désolé, cet te erreur ser a corrigée." },

			{ "WrongFormat.WrongDate",
					"Désolé, mais la date indiquée n'est pascorrecte." },

			{ "ShowComparisonDeputy.Name", "Nom:" },
			{ "ShowComparisonDeputy.SessionsWhatched", "Sessions Regardé:" },
			{ "ShowComparisonDeputy.TotalNumberSessions", "Nombre of sessions:" },
			{ "ShowComparisonDeputy.Percent", "Pour cent:" },
			{ "ShowComparisonDeputy.Sessions", "Sessions:" },

			{ "ShowDay.Session", "Session:" },
			{ "ShowDay.Sessions", "Sessions:" },

			{ "ShowEstatistic.Name", "Nom:" },
			{ "ShowEstatistic.SessionsWhatched", "Sessions Régardé:" },
			{ "ShowEstatistic.TotalNumberSessions", "Number of sessions:" },
			{ "ShowEstatistic.Percent", "Pour cent:" },
			{ "ShowEstatistic.Sessions", "Sessions:" },
			{ "ShowEstatistic.ask", "Voulez-vous comparer avec d'autresdéputé?" },

			{ "ShowParty.PresenceAvarege", "Moyenne de Présence:" },

			{ "PartyNotFound.warning", "Partipolitique nontrouvé!" },
			{ "PartyNotFound.tryAgain", "Voulez-vous essayer à nouveau?" },

			{ "WhoWeAre.WhoWeAre", "Qui Nous Sommes:" },
			{ "WhoWeAre.WeAre",
					"Noussommesdesétudiants de génielogiciel à l'Université de Brasilia" },
			{ "WhoWeAre.Members", "Membres:" },
			{ "WhoWeAre.MDS", "Développement des méthodes de logiciel:" },
			{ "WhoWeAre.GPP", "Projet et Portefeuille de Gestion de Logiciel:" },

			{ "RankingDeputy.ranking", "ClassementDéputé:" },
			{ "RankingDeputy.TheFiveMore", "Les CinqPlus Présente" },
			{ "RankingDeputy.TheFiveless", "Les CinqMoinsPrésente" },
			{ "RankingDeputy.NotAvaliable",
					"Les données pour cedéputén'est pas disponible" },

			{ "CompleteRanking.DeputyRanking", "Classement du Député:" },
			{ "CompleteRanking.DeputyNoData",
					"Les données pour cedéputén'est pas disponible:" },

			{ "DeputyPresents.Title", "DéputésPrésentes" },

			{ "SQLDetect.Stupid", "Désolé, mais nous ne sommespasstupides=D" },
			{ "SQLDetect.BeGood", "Promettez-vousêtre bon??" },
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

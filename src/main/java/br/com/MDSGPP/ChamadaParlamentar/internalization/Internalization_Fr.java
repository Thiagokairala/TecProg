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

			{ "TrackParty.InsertPartysName",
					"Entrez le nom du parti politique." },

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
			{ "SQLDetect.Yes", "Oui!!" },
			{ "SQLDetect.No", "Non!!" },

			{ "index.openData", "Droit de données ouverte" },
			{
					"index.firstParagraph",
					"Selon la définition de l'Open Knowledge Foundation, les données sont ouverts quand quelqu'un"
							+ "peuvent utiliser librement, ré-utiliser et de les partager, en étant celui, au maximum, à la demande de dire où il a obtenu les données de,"
							+ "et le maintien de la licence. C'est généralement satisfaite par la publication des données sur le format ouvert et licence ouverte." },

			{ "index.secondParagraph",
					"Les données ouvertes sont disposées sur trois lois fondamentales et huit directeurs." },
			{
					"index.thirdParagraph",
					"Les trois lois:<br> Le spécialiste de la politique publique et activiste de données ouverte "
							+ "David Eaves<br> proposé ce qui suit \"laws\":<br> Si les données ne peuvent pas être trouvés et indexés dans le Web, il n'existe pas;"
							+ "<br> Si ce n'est pas déjà ouvert et disponible dans un format lisible par une machine, il ne peut pas être réutilisé;"
							+ "<br> Si une disposition juridique ne permet pas sa réplication, il n'est pas utile; <br> Les lois ont été proposées pour Open Data gouvernement, "
							+ " mais vous pouvez dire qu'ils s'appliquent à l'ouverture des données en général. " },

	};

}

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

			{ "TrackParty.InsertPartysName",
					"Entrez le nom du parti politique." },

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
			{ "SQLDetect.Yes", "Oui!!" },
			{ "SQLDetect.No", "Non!!" },

			{ "index.openData", "Droit de donn�es ouverte" },
			{
					"index.firstParagraph",
					"Selon la d�finition de l'Open Knowledge Foundation, les donn�es sont ouverts quand quelqu'un"
							+ "peuvent utiliser librement, r�-utiliser et de les partager, en �tant celui, au maximum, � la demande de dire o� il a obtenu les donn�es de,"
							+ "et le maintien de la licence. C'est g�n�ralement satisfaite par la publication des donn�es sur le format ouvert et licence ouverte." },

			{ "index.secondParagraph",
					"Les donn�es ouvertes sont dispos�es sur trois lois fondamentales et huit directeurs." },
			{
					"index.thirdParagraph",
					"Les trois lois:<br> Le sp�cialiste de la politique publique et activiste de donn�es ouverte "
							+ "David Eaves<br> propos� ce qui suit \"laws\":<br> Si les donn�es ne peuvent pas �tre trouv�s et index�s dans le Web, il n'existe pas;"
							+ "<br> Si ce n'est pas d�j� ouvert et disponible dans un format lisible par une machine, il ne peut pas �tre r�utilis�;"
							+ "<br> Si une disposition juridique ne permet pas sa r�plication, il n'est pas utile; <br> Les lois ont �t� propos�es pour Open Data gouvernement, "
							+ " mais vous pouvez dire qu'ils s'appliquent � l'ouverture des donn�es en g�n�ral. " },

	};

}

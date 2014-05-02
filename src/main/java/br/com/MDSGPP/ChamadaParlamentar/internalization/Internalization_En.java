package br.com.MDSGPP.ChamadaParlamentar.internalization;

import java.util.ListResourceBundle;

public class Internalization_En extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return contents;
	}

	static final Object[][] contents = {
			/**
			 * translates for header.
			 */
			{ "menu.Home", "Home" },

			{ "menu.Deputys", "Deputies" },
			{ "menu.TrackDeputy", "Track Deputies" },

			{ "menu.Party", "Party" },
			{ "menu.TrackParty", "Track Party" },

			{ "menu.Sessions", "Sessions" },
			{ "menu.TrackSession", "Track Session" },

			{ "menu.Ranking", "Ranking" },
			{ "menu.RankingTop5", "Top 5 Ranking" },
			{ "menu.CompleteRanking", "Complete Ranking" },

			{ "TrackDeputy.InsertDeputysName", "Enter the name of the deputy" },

			{ "TrackParty.InsertPartysName", "Enter the name of your party." },

			{ "DataNotAvailable.SearchOtherDeputys", "to search other deputys." },
			{ "DataNotAvailable.click", "Click" },
			{ "DataNotAvailable.Here", "here" },
			{ "DataNotAvailable.NoData",
					"Sorry the data for this deputy is not available." },

			{ "TrackSession.InsertDay", "Enter the day" },
			{ "TrackSession.Page", "Page" },
			{ "TrackSession.Date", "Date" },

			{ "DateNotFound.DateNotFound", "Date not found" },
			{ "DateNotFound.TryAgain", "Want to try again?" },

			{ "DeputyNotFound.DeputyNotFound", "Deputy Not Found!" },
			{ "DeputyNotFound.TryAgain", "Want to try again?" },

			{ "Error.CorrectedError", "Sorry, this error will be corrected." },

			{ "Footer.WhoWeAre", "Who We Are" },
			{ "Error.CorrectedError", "Sorry, this error will be corrected." },

			{ "WrongFormat.WrongDate",
					"Sorry, but the date entered by you is not correct." },

			{ "ShowComparisonDeputy.Name", "Name:" },
			{ "ShowComparisonDeputy.SessionsWhatched", "Sessions Whatched:" },
			{ "ShowComparisonDeputy.TotalNumberSessions", "Number of sessions:" },
			{ "ShowComparisonDeputy.Percent", "Percent:" },
			{ "ShowComparisonDeputy.Sessions", "Sessions:" },

			{ "ShowDay.Session", "Session:" },

			{ "ShowDay.Sessions", "Sessions:" },

			{ "ShowEstatistic.Name", "Name:" },
			{ "ShowEstatistic.SessionsWhatched", "Sessions Whatched:" },
			{ "ShowEstatistic.TotalNumberSessions", "Number of sessions:" },
			{ "ShowEstatistic.Percent", "Percent:" },
			{ "ShowEstatistic.Sessions", "Sessions:" },
			{ "ShowEstatistic.ask", "Want to compare it with other Deputy?" },

			{ "ShowParty.PresenceAvarege", "Presence average:" },

			{ "PartyNotFound.warning", "Party not found!" },
			{ "PartyNotFound.tryAgain", "Want to try again?" },

			{ "WhoWeAre.WhoWeAre", "Who we are:" },
			{ "WhoWeAre.WeAre",
					"We are students of Software Engineering at the University of Brasilia" },
			{ "WhoWeAre.Members", "Members:" },
			{ "WhoWeAre.MDS", "Methods Software Development:" },
			{ "WhoWeAre.GPP", "Project and Portfolio Management Software:" },

			{ "RankingDeputy.ranking", "Ranking Deputy:" },
			{ "RankingDeputy.TheFiveMore", "The five more presents" },
			{ "RankingDeputy.TheFiveless", "The five less presents" },
			{ "RankingDeputy.NotAvaliable", "Deputys with no data available" },

			{ "CompleteRanking.DeputyRanking", "Deputy's ranking:" },
			{ "CompleteRanking.DeputyNoData", "Deputy without data available:" },

			{ "DeputyPresents.Title", "Deputys Presents" },

			{ "SQLDetect.Stupid", "Sorry, but we aren't stupid =D" },
			{ "SQLDetect.BeGood", "Do you promise be good??" },
			{ "SQLDetect.Yes", "Yes!!" }, { "SQLDetect.No", "No!!" },

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

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

			{ "menu.Deputys", "Deputys" },
			{ "menu.TrackDeputy", "Track Deputy" },

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
			{ "TrackSession.Page", "Page" }, { "TrackSession.Date", "Date" },

			{ "DateNotFound.DateNotFound", "Date not found" },
			{ "DateNotFound.TryAgain", "Want to try again?" },

			{ "DeputyNotFound.DeputyNotFound", "Deputy Not Found!" },
			{ "DeputyNotFound.TryAgain", "Want to try again?" },

			{ "Error.CorrectedError", "Sorry, this error will be corrected." },

			{ "Footer.WhoWeAre", "Who We Are" },
			{ "Error.CorrectedError", "Sorry, this error will be corrected." },
			
			{ "WrongFormat.WrongDate", "Sorry, but the date entered by you is not correct." },
			
			{ "ShowComparisonDeputy.Name1", "Name:"},
			{ "ShowComparisonDeputy.SessionsWhatched1", "Sessions Whatched:"},
			{ "ShowComparisonDeputy.TotalNumberSessions1", "Number of sessions:"},
			{ "ShowComparisonDeputy.Percent1", "Percent:"},
			{ "ShowComparisonDeputy.Sessions1", "Sessions:"},
			
			{ "ShowComparisonDeputy.Name2", "Name:"},
			{ "ShowComparisonDeputy.SessionsWhatched2", "Sessions Whatched:"},
			{ "ShowComparisonDeputy.TotalNumberSessions2", "Number of sessions:"},
			{ "ShowComparisonDeputy.Percent2", "Percent:"},
			{ "ShowComparisonDeputy.Sessions2", "Sessions:"},
			
			{ "ShowDay.Session", "Session:" },
			{ "ShowDay.Sessions", "Sessions:"},
			
			{ "ShowEstatistic.Name", "Name:"},
			{ "ShowEstatistic.SessionsWhatched", "Sessions Whatched:"},
			{ "ShowEstatistic.TotalNumberSessions", "Number of sessions:"},
			{ "ShowEstatistic.Percent", "Percent:"},
			{ "ShowEstatistic.Sessions", "Sessions:"},
			{ "ShowEstatistic.ask", "Want to compare it with other Deputy?"},

			{ "PartyNotFound.warning", "Party not found!" },
			{ "PartyNotFound.tryAgain", "Want to try again?" },
			
	};

}

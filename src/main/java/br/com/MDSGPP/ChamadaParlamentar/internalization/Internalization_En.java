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

			{ "trackDeputy.Home", "Home" },
			{ "TrackDeputy.InsertDeputysName", "Enter the name of the deputy" },

			{ "TrackParty.Home", "Home" },
			{ "TrackParty.InsertPartysName", "Enter the name of your party." },

			{ "DataNotAvailable.SearchOtherDeputys",
					"Click here to search other deputys." },

			{ "TrackSession.InsertDay", "Enter the day" },
			{ "TrackSession.Page", "Page" }, { "TrackSession.Date", "Date" },

			{ "DateNotFound.DateNotFound", "Date not found" },
			{ "DateNotFound.TryAgain", "Want to try again?" },

			{ "DeputyNotFound.DeputyNotFound", "Deputy Not Found!" },
			{ "DeputyNotFound.TryAgain", "Want to try again?" },

	};

}

package br.com.vdantas.nbaStatsApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vdantas.nbaStatsApi.model.request.AverageRequest;
import br.com.vdantas.nbaStatsApi.model.request.GameRequest;
import br.com.vdantas.nbaStatsApi.model.request.PlayersRequest;
import br.com.vdantas.nbaStatsApi.model.request.StatsRequest;
import br.com.vdantas.nbaStatsApi.model.response.DataAverageWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.DataGameWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.DataPlayerWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.DataStatsWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.DataTeamWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.GameResponse;
import br.com.vdantas.nbaStatsApi.model.response.PlayerResponse;
import br.com.vdantas.nbaStatsApi.model.response.TeamResponse;
import br.com.vdantas.nbaStatsApi.restclient.BallDontLie;

@Service
public class StatsService {
	
	@Autowired
	private BallDontLie ballDontLie;

	public DataPlayerWrapperResponse getPlayersSearch(PlayersRequest player) {
		return ballDontLie.getPlayersSearch(player.getPlayer(),player.getPage(),player.getPerPage()).getBody();
	}

	public PlayerResponse getPlayerSearchSpecific(String playerId) {
		return ballDontLie.getPlayerSearchSpecific(playerId).getBody();
	}

	public DataTeamWrapperResponse getTeamsPage(Integer page) {
		return ballDontLie.getTeamSearch(page).getBody();
	}
	
	public TeamResponse getTeamsSpecific(String teamId) {
		return ballDontLie.getTeamSearchSpecific(teamId).getBody();
	}

	public DataGameWrapperResponse getGamesSearch(GameRequest game) {
		return ballDontLie.getGamesSearch(game.getPage(),
											game.getSeasons(),
											game.getTeamsIds(),
											game.getStartDate(),
											game.getEndDate(),
											game.getPostSeason()).getBody();
	}

	public GameResponse getGameSearchSpecific(String gameId) {
		return  ballDontLie.getGameSearchSpecific(gameId).getBody();
	}

	public DataStatsWrapperResponse getStatsSearch(StatsRequest stats) {
		return  ballDontLie.getStatsSearch(stats.getPage(),
											stats.getSeasons(),
											stats.getGamesIds(),
											stats.getPlayersIds(),
											stats.getStartDate(),
											stats.getEndDate(),
											stats.getPostSeason(),
											stats.getPerPage());
	}

	public DataAverageWrapperResponse getAveragesSearch(AverageRequest average) {
		return ballDontLie.getAveragesSerach(average.getSeason(),
											  average.getPlayerIds());
	}

}

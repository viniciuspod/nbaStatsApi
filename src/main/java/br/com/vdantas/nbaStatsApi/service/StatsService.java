package br.com.vdantas.nbaStatsApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vdantas.nbaStatsApi.model.request.PlayersRequest;
import br.com.vdantas.nbaStatsApi.model.response.DataPlayerWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.DataTeamWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.PlayerResponse;
import br.com.vdantas.nbaStatsApi.model.response.TeamResponse;
import br.com.vdantas.nbaStatsApi.restclient.BallDontLie;

@Service
public class StatsService {
	
	@Autowired
	private BallDontLie ballDontLie;

	public DataPlayerWrapperResponse getPlayersSearch(PlayersRequest player) {
		return ballDontLie.getPlayersSearch(player.getPlayer(),player.getPage()).getBody();
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

}

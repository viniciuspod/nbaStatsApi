package br.com.vdantas.nbaStatsApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vdantas.nbaStatsApi.model.request.PlayersRequest;
import br.com.vdantas.nbaStatsApi.model.response.DataWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.PlayerResponse;
import br.com.vdantas.nbaStatsApi.restclient.BallDontLie;

@Service
public class StatsService {
	
	@Autowired
	private BallDontLie ballDontLie;

	public DataWrapperResponse getPlayersSearch(PlayersRequest player) {
		return ballDontLie.getPlayersSearch(player.getPlayer()).getBody();
	}

	public PlayerResponse getPlayerSearchSpecific(String playerId) {
		return ballDontLie.getPlayerSearchSpecific(playerId).getBody();
	}
	
	

}

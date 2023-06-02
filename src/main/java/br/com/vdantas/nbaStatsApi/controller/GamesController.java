package br.com.vdantas.nbaStatsApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vdantas.nbaStatsApi.model.request.GameRequest;
import br.com.vdantas.nbaStatsApi.model.request.PlayersRequest;
import br.com.vdantas.nbaStatsApi.model.response.DataGameWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.DataPlayerWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.GameResponse;
import br.com.vdantas.nbaStatsApi.model.response.PlayerResponse;
import br.com.vdantas.nbaStatsApi.service.StatsService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/api/v1/games")
@Slf4j
public class GamesController {
	
	@Autowired
	private StatsService statsService;
	
	@GetMapping(value = "/search", produces = "application/json", consumes = "application/json;")
	@ResponseBody
	public DataGameWrapperResponse getGamesSearch(@RequestBody GameRequest game) {	
		return statsService.getGamesSearch(game);
	}
	
	@GetMapping(value = "/search/{gameId}", produces = "application/json")
	@ResponseBody
	public GameResponse getGameSearchSpecific(@PathVariable("gameId") String gameId) {	
		return statsService.getGameSearchSpecific(gameId);
	}		
}

package br.com.vdantas.nbaStatsApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vdantas.nbaStatsApi.model.request.PlayersRequest;
import br.com.vdantas.nbaStatsApi.model.response.DataWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.PlayerResponse;
import br.com.vdantas.nbaStatsApi.service.StatsService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/api/players")
@Slf4j
public class PlayersController {
	
	@Autowired
	private StatsService statsService;

	@GetMapping(value = "/search", produces = "application/json", consumes = "application/json;")
	@ResponseBody
	public DataWrapperResponse getPlayersSearch(@RequestBody PlayersRequest player) {	
		return statsService.getPlayersSearch(player);
	}
	
	@GetMapping(value = "/search/{playerId}", produces = "application/json")
	@ResponseBody
	public PlayerResponse getPlayerSearchSpecific(@PathVariable("playerId") String playerId) {	
		return statsService.getPlayerSearchSpecific(playerId);
	}	
}

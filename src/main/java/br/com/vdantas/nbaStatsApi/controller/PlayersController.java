package br.com.vdantas.nbaStatsApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vdantas.nbaStatsApi.model.request.PlayersRequest;
import br.com.vdantas.nbaStatsApi.model.response.DataPlayerWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.PlayerGetResponse;
import br.com.vdantas.nbaStatsApi.model.response.PlayerPostResponse;
import br.com.vdantas.nbaStatsApi.model.response.PlayerResponse;
import br.com.vdantas.nbaStatsApi.service.PlayerService;
import br.com.vdantas.nbaStatsApi.service.StatsService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/api/v1/players")
@Slf4j
public class PlayersController {
	
	@Autowired
	private StatsService statsService;
	
	@Autowired
	private PlayerService playerService;

	@PostMapping(value = "/search", produces = "application/json", consumes = "application/json;")
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:3000")
	public DataPlayerWrapperResponse getPlayersSearch(@RequestBody PlayersRequest player) {	
		return statsService.getPlayersSearch(player);
	}
	
	@GetMapping(value = "/search/{playerId}", produces = "application/json")
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:3000")
	public PlayerResponse getPlayerSearchSpecific(@PathVariable("playerId") String playerId) {	
		return statsService.getPlayerSearchSpecific(playerId);
	}	
	
	@PostMapping(value = "/saveAllPlayers", produces = "application/json")
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:3000")
	public PlayerPostResponse PostPlayers () {	
		return playerService.postPlayers();
	}	
	
	@GetMapping(value = "/getAllPlayers", produces = "application/json")
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:3000")
	public PlayerGetResponse GetPlayers () throws Exception {
		return playerService.getPlayers();
	}	
}

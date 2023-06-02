package br.com.vdantas.nbaStatsApi.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.vdantas.nbaStatsApi.model.response.DataPlayerWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.PlayerResponse;
import br.com.vdantas.nbaStatsApi.model.response.TeamResponse;
import br.com.vdantas.nbaStatsApi.model.response.DataTeamWrapperResponse;

@FeignClient(name = "ballDontLie",url = "https://balldontlie.io/api/v1")
public interface BallDontLie {

	@GetMapping(value = "/players", produces = "application/json; charset=utf-8")
	public ResponseEntity<DataPlayerWrapperResponse> getPlayersSearch(@RequestParam("search") String search,
																@RequestParam("page") Integer page);

	@GetMapping(value = "/players/{playerId}", produces = "application/json; charset=utf-8")
	public  ResponseEntity<PlayerResponse> getPlayerSearchSpecific(@PathVariable("playerId") String playerId);
	
	@GetMapping(value = "/teams", produces = "application/json; charset=utf-8")
	public  ResponseEntity<DataTeamWrapperResponse> getTeamSearch(@RequestParam("page") Integer page);
	
	@GetMapping(value = "/teams/{teamId}", produces = "application/json; charset=utf-8")
	public  ResponseEntity<TeamResponse> getTeamSearchSpecific(@PathVariable("teamId") String teamId);	
}

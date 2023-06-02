package br.com.vdantas.nbaStatsApi.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.vdantas.nbaStatsApi.model.response.DataWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.PlayerResponse;

@FeignClient(name = "ballDontLie",url = "https://balldontlie.io/api/v1")
public interface BallDontLie {

	@GetMapping(value = "/players", produces = "application/json; charset=utf-8")
	public ResponseEntity<DataWrapperResponse> getPlayersSearch(@RequestParam("search") String search);

	@GetMapping(value = "/players/{playerId}", produces = "application/json; charset=utf-8")
	public  ResponseEntity<PlayerResponse> getPlayerSearchSpecific(@PathVariable("playerId") String playerId);
}

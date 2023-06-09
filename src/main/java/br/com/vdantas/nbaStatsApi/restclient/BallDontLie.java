package br.com.vdantas.nbaStatsApi.restclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.vdantas.nbaStatsApi.model.request.GameRequest;
import br.com.vdantas.nbaStatsApi.model.response.DataAverageWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.DataGameWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.DataPlayerWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.DataStatsWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.PlayerResponse;
import br.com.vdantas.nbaStatsApi.model.response.TeamResponse;
import br.com.vdantas.nbaStatsApi.model.response.DataTeamWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.GameResponse;

@FeignClient(name = "ballDontLie",url = "https://balldontlie.io/api/v1")
public interface BallDontLie {

	@GetMapping(value = "/players", produces = "application/json; charset=utf-8")
	public ResponseEntity<DataPlayerWrapperResponse> getPlayersSearch(@RequestParam("search") String search,
																	  @RequestParam("page") Integer page,
																	  @RequestParam("per_page") Integer perPage);

	@GetMapping(value = "/players/{playerId}", produces = "application/json; charset=utf-8")
	public  ResponseEntity<PlayerResponse> getPlayerSearchSpecific(@PathVariable("playerId") String playerId);
	
	@GetMapping(value = "/teams", produces = "application/json; charset=utf-8")
	public  ResponseEntity<DataTeamWrapperResponse> getTeamSearch(@RequestParam("page") Integer page);
	
	@GetMapping(value = "/teams/{teamId}", produces = "application/json; charset=utf-8")
	public  ResponseEntity<TeamResponse> getTeamSearchSpecific(@PathVariable("teamId") String teamId);

	@GetMapping(value = "/games", produces = "application/json; charset=utf-8")
	public ResponseEntity<DataGameWrapperResponse> getGamesSearch(@RequestParam("page") Integer page,
																	@RequestParam("seasons[]") List<Integer> seasons,
																	@RequestParam("team_ids[]") List<Integer> teamsIds,
																	@RequestParam("start_date") String startDate,
																	@RequestParam("end_date") String endDate,
																	@RequestParam("postseason") Boolean postSeason);
	
	@GetMapping(value = "/games/{gameId}", produces = "application/json; charset=utf-8")
	public ResponseEntity<GameResponse> getGameSearchSpecific(@PathVariable("gameId") String gameId);

	@GetMapping(value = "/stats", produces = "application/json; charset=utf-8")
	public DataStatsWrapperResponse getStatsSearch(@RequestParam("page") Integer page,
													@RequestParam("seasons[]") List<Integer> seasons,
													@RequestParam("game_ids[]") List<Integer> gamesIds,
													@RequestParam("player_ids[]") List<Integer> playerIds,
													@RequestParam("start_date") String startDate,
													@RequestParam("end_date") String endDate,
													@RequestParam("postseason") Boolean postSeason,
													@RequestParam("per_page") Integer perPage);

	@GetMapping(value = "/season_averages", produces = "application/json; charset=utf-8")
	public DataAverageWrapperResponse getAveragesSerach(@RequestParam("season") String season,
														 @RequestParam("player_ids[]") List<Integer> playerIds);	
}

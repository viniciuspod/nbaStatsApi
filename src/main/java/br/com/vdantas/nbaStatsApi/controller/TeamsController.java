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

import br.com.vdantas.nbaStatsApi.model.TeamsLogo;
import br.com.vdantas.nbaStatsApi.model.request.PlayersRequest;
import br.com.vdantas.nbaStatsApi.model.response.DataPlayerWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.DataTeamWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.TeamResponse;
import br.com.vdantas.nbaStatsApi.model.response.TeamsLogoResponse;
import br.com.vdantas.nbaStatsApi.service.StatsService;
import br.com.vdantas.nbaStatsApi.service.TeamService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/api/v1/teams")
@Slf4j
public class TeamsController {
	
	@Autowired
	private StatsService statsService;

	@Autowired
	private TeamService teamService;
	
	@PostMapping(value = "/search", produces = "application/json")
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:3000")
	public DataTeamWrapperResponse getTeamsSearch(@RequestParam("page") Integer page) {	
		return statsService.getTeamsPage(page);
	}	
	
	@GetMapping(value = "/search/{teamId}", produces = "application/json")
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:3000")
	public TeamResponse getTeamSearchSpecific(@PathVariable("teamId") String teamId) {	
		return statsService.getTeamsSpecific(teamId);
	}		
	
	@GetMapping(value = "/search/logo/{teamId}", produces = "application/json")
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:3000")
	public TeamsLogoResponse getTeamSearchLogoSpecific(@PathVariable("teamId") Integer teamId) {	
		return teamService.getTeamLogoSpecific(teamId);
	}	
}

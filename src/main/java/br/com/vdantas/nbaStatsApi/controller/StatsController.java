package br.com.vdantas.nbaStatsApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vdantas.nbaStatsApi.model.request.PlayersRequest;
import br.com.vdantas.nbaStatsApi.model.request.StatsRequest;
import br.com.vdantas.nbaStatsApi.model.response.DataPlayerWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.DataStatsWrapperResponse;
import br.com.vdantas.nbaStatsApi.service.StatsService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/api/v1/stats")
@Slf4j
public class StatsController {
	
	@Autowired
	private StatsService statsService;

	@PostMapping(value = "/search", produces = "application/json", consumes = "application/json;")
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:3000")
	public DataStatsWrapperResponse getPlayersSearch(@RequestBody StatsRequest stats) {	
		return statsService.getStatsSearch(stats);
	}
}

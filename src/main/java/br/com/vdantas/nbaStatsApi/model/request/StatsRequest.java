package br.com.vdantas.nbaStatsApi.model.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class StatsRequest {
	
	@JsonProperty("page")
	private Integer page;
	
	@JsonProperty("seasons")
	private List<Integer> seasons;
	
	@JsonProperty("playersIds")
	private List<Integer> playersIds;
	
	@JsonProperty("gameIds")
	private List<Integer> gamesIds;	
	
	@JsonProperty("postSeason")
	private Boolean postSeason;
	
	@JsonProperty("startDate")
	private String startDate;
	
	@JsonProperty("endDate")
	private String endDate;
	
	@JsonProperty("perPage")
	private Integer perPage;
}

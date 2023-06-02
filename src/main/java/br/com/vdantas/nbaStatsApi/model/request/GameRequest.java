package br.com.vdantas.nbaStatsApi.model.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class GameRequest {

	@JsonProperty("page")
	private Integer page;
	
	@JsonProperty("seasons")
	private List<Integer> seasons;
	
	@JsonProperty("teamsIds")
	private List<Integer> teamsIds;
	
	@JsonProperty("postSeason")
	private Boolean postSeason;
	
	@JsonProperty("startDate")
	private String startDate;
	
	@JsonProperty("endDate")
	private String endDate;
}

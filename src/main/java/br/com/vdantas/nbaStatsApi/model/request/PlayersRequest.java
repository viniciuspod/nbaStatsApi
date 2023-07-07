package br.com.vdantas.nbaStatsApi.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PlayersRequest {

	@JsonProperty("player")
	private String player;
	
	@JsonProperty("page")
	private Integer page;
	
	@JsonProperty("perpage")
	private Integer perPage;
}

package br.com.vdantas.nbaStatsApi.model.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AverageRequest {

	@JsonProperty("player_ids")
	private List<Integer> playerIds;
	
	@JsonProperty("season")
	private String season;
}

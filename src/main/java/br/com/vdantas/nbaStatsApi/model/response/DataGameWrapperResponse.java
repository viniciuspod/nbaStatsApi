package br.com.vdantas.nbaStatsApi.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DataGameWrapperResponse {
	
	@JsonProperty("data")
	private List<GameResponse> dataGames;
	
	@JsonProperty("meta")
	private MetaResponse metaGame;

}

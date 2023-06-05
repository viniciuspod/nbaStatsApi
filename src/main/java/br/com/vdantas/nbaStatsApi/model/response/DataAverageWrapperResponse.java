package br.com.vdantas.nbaStatsApi.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DataAverageWrapperResponse {
		
		@JsonProperty("data")
		private List<AverageResponse> dataGames;
		
		@JsonProperty("meta")
		private MetaResponse metaGame;
}

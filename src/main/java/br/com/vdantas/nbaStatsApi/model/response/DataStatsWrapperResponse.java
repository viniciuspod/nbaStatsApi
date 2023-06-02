package br.com.vdantas.nbaStatsApi.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DataStatsWrapperResponse {
	
	@JsonProperty("data")
	private List<StatsResponse> dataPlayer;
	
	@JsonProperty("meta")
	private MetaResponse metaPlayer;
}

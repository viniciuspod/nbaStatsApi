package br.com.vdantas.nbaStatsApi.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DataPlayerWrapperResponse {

	@JsonProperty("data")
	private List<PlayerResponse> data;
	
	@JsonProperty("meta")
	private MetaResponse meta;
}

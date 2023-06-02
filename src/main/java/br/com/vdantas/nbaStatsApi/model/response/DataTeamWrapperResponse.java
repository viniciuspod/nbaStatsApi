package br.com.vdantas.nbaStatsApi.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DataTeamWrapperResponse {

	@JsonProperty("data")
	private List<TeamResponse> dataTeam;
	
	@JsonProperty("meta")
	private MetaResponse metaTeam;	
}

package br.com.vdantas.nbaStatsApi.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PlayerPostResponse {
	
	@JsonProperty("status")
	private String status;
	
	@JsonProperty("message")
	private String message;
}

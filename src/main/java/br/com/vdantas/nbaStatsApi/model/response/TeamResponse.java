package br.com.vdantas.nbaStatsApi.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TeamResponse {

	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("abbreviation")
	private String abbreviation;
	
	@JsonProperty("city")
	private String city;
	
	@JsonProperty("division")
	private String division;
	
	@JsonProperty("full_name")
	private String fullName;
	
	@JsonProperty("name")
	private String name;
}

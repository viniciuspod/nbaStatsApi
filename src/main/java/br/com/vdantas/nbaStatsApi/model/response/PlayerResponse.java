package br.com.vdantas.nbaStatsApi.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PlayerResponse {

	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("first_name")
	private String firstName;
	
	@JsonProperty("height_feet")
	private Integer heightFeet;
	
	@JsonProperty("height_inches")
	private Integer heightInches;
	
	@JsonProperty("last_name")
	private String lastName;
	
	@JsonProperty("position")
	private String position;
	
	@JsonProperty("team")
	private TeamResponse team;
	
	@JsonProperty("weight_pounds")
	private Integer weightPounds;
}


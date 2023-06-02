package br.com.vdantas.nbaStatsApi.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class GameStatsResponse {
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("date")
	private String date;
	
	@JsonProperty("home_team_id")
	private Integer homeTeamId;
	
	@JsonProperty("home_team_score")
	private Integer homeTeamScore;
	
	@JsonProperty("period")
	private Integer period;
	
	@JsonProperty("postseason")
	private Boolean postSeason;
	
	@JsonProperty("season")
	private Integer season;
	
	@JsonProperty("status")
	private String status;
	
	@JsonProperty("time")
	private String time;
	
	@JsonProperty("visitor_team_id")
	private Integer visitorTeam;
	
	@JsonProperty("visitor_team_score")
	private Integer visitorTeamScore;
}

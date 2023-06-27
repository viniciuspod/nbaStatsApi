package br.com.vdantas.nbaStatsApi.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.vdantas.nbaStatsApi.model.TeamsLogo;
import lombok.Data;

@Data
public class TeamsLogoResponse {
	
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("teamId")
	private Integer teamId;
	
	@JsonProperty("imageSvg")
	private String imageSvg;
	
	public TeamsLogoResponse(){
		
	}
	
	public TeamsLogoResponse(TeamsLogo teamsLogo){
		this.id = new Integer(teamsLogo.getId().intValue());
		this.teamId = new Integer(teamsLogo.getTeamId().intValue());
		this.imageSvg = teamsLogo.getImageSvg();
	}
}

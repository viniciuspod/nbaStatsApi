package br.com.vdantas.nbaStatsApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "T_TEAMSLOGO")
@Data
public class TeamsLogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name= "TEAMSLOGO_ID")
	private Long id;
	
	@Column(name = "TEAMSLOGO_TEAM_ID")
	private Long teamId;
	
	@Column(name = "TEAMSLOGO_IMAGE_SVG")
	private String imageSvg;
}

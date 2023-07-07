package br.com.vdantas.nbaStatsApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.vdantas.nbaStatsApi.model.response.PlayerResponse;
import lombok.Data;

@Entity
@Table(name = "T_PLAYERNAMES")
@Data
public class PlayerNames {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name= "PLAYERNAMES_ID")
	private Long id;
	
	@Column(name = "PLAYERNAMES_PLAYER_ID")
	private Long playerId;
	
	@Column(name = "PLAYERNAMES_FULLNAME")
	private String fullName;
	
	
	public PlayerNames(PlayerResponse player) {
		this.playerId = player.getId().longValue();
		this.fullName = player.getFirstName() + " " + player.getLastName();
	}

	public PlayerNames() {
		
	}
}

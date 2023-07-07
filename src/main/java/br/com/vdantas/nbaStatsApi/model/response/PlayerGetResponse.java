package br.com.vdantas.nbaStatsApi.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.vdantas.nbaStatsApi.model.PlayerNames;
import lombok.Data;

@Data
public class PlayerGetResponse {

	@JsonProperty("playerNames")
	private List<PlayerNames> playerNames;
	
	@JsonProperty("status")
	private String status;
}

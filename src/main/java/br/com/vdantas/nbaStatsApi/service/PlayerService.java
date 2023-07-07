package br.com.vdantas.nbaStatsApi.service;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vdantas.nbaStatsApi.model.PlayerNames;
import br.com.vdantas.nbaStatsApi.model.request.PlayersRequest;
import br.com.vdantas.nbaStatsApi.model.response.DataPlayerWrapperResponse;
import br.com.vdantas.nbaStatsApi.model.response.PlayerGetResponse;
import br.com.vdantas.nbaStatsApi.model.response.PlayerPostResponse;
import br.com.vdantas.nbaStatsApi.repositories.PlayerNamesRepository;

@Service
public class PlayerService {

	@Autowired
	private StatsService statsService;

	@Autowired
	private PlayerNamesRepository playerNamesRepository;

	public PlayerPostResponse postPlayers() {

		Integer page = 1;
		Integer perPage = 100;
		Integer totalPages = 1;
		Integer count = 0;
		
		PlayerPostResponse playerPostResponse = new PlayerPostResponse();
		try {

			PlayersRequest playersRequest = new PlayersRequest();
			playersRequest.setPerPage(perPage);
			while (page <= totalPages) {
				playersRequest.setPage(page);
				DataPlayerWrapperResponse data = statsService.getPlayersSearch(playersRequest);
				totalPages = data.getMetaPlayer().getTotalPages();
				page = page + 1;
				count++;

				data.getDataPlayer().forEach(player -> {
					PlayerNames playerNames = playerNamesRepository.findByPlayerId(player.getId().longValue());
					if (playerNames == null) {
						PlayerNames playerName = new PlayerNames(player);
						playerNamesRepository.save(playerName);
					}
				});

				if (count % 30 == 0) {
					try {
						// Pausa de 1 minuto (60.000 milissegundos)
						TimeUnit.MINUTES.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			playerPostResponse.setStatus("OK");
			playerPostResponse.setMessage("Players Inseridos");
		} catch (Exception e) {
			playerPostResponse.setStatus("ER");
			playerPostResponse.setMessage("Erro de execucao");
		}
		return playerPostResponse;
	}

	public PlayerGetResponse getPlayers() throws Exception {
		PlayerGetResponse playerGetResponse = new PlayerGetResponse();
		try {
			List<PlayerNames> playersNames = playerNamesRepository.findAllPlayer();
			if (playersNames != null) {
				playerGetResponse.setPlayerNames(playersNames);
				playerGetResponse.setStatus("OK");
			}		
		} catch (Exception e) {
			throw new Exception("Erro ao obter os nomes dos jogadores: " + e.getMessage());
		}
		return playerGetResponse;
	}

}

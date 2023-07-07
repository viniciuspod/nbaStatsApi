package br.com.vdantas.nbaStatsApi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vdantas.nbaStatsApi.model.PlayerNames;


@Repository
public interface PlayerNamesRepository extends JpaRepository<PlayerNames, Long> {

	PlayerNames findByPlayerId(Long playerId);

	@Query(value= "select * "
		   + "from t_playernames r "
		   + "where r.PLAYERNAMES_PLAYER_ID < 1000", nativeQuery = true)
	List<PlayerNames> findAllPlayer();
}

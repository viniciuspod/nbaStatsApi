package br.com.vdantas.nbaStatsApi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.vdantas.nbaStatsApi.model.TeamsLogo;

@Repository
public interface TeamsLogoRepository  extends CrudRepository<TeamsLogo, Long>{
	
	TeamsLogo findByTeamId(Long teamId);
}



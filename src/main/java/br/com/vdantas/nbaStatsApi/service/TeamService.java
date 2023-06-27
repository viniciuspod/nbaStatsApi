package br.com.vdantas.nbaStatsApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vdantas.nbaStatsApi.model.TeamsLogo;
import br.com.vdantas.nbaStatsApi.model.response.TeamsLogoResponse;
import br.com.vdantas.nbaStatsApi.repositories.TeamsLogoRepository;

@Service
public class TeamService {
	
	@Autowired
	private TeamsLogoRepository teamsLogoRepository;

	public TeamsLogoResponse getTeamLogoSpecific(Integer teamId) {		
		TeamsLogo teamsLogo = teamsLogoRepository.findByTeamId((long) teamId);		
		return new TeamsLogoResponse(teamsLogo);
	}

}

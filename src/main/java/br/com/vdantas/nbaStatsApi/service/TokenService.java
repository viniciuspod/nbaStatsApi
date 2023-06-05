package br.com.vdantas.nbaStatsApi.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import br.com.vdantas.nbaStatsApi.model.Usuario;

@Service
public class TokenService {
	
	@Value("${app.jwtSecret}")
	private String jwtSecret;
	
	@Value("${app.jwtExpirationMs}")
	private int jwtExpirationMs;

	public String getSubject(String token) {
		return JWT.require(Algorithm.HMAC256(jwtSecret))
				.build().verify(token).getSubject();
	}	


}


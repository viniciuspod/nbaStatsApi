package br.com.vdantas.nbaStatsApi.confs;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import br.com.vdantas.nbaStatsApi.model.Usuario;
import br.com.vdantas.nbaStatsApi.repositories.UsuarioRepository;
import br.com.vdantas.nbaStatsApi.service.TokenService;

@Component
public class FilterToken extends OncePerRequestFilter {

	@Autowired
	private TokenService tokenService;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String token;
		
		String authorizationHeader = request.getHeader("Authorization");
		
		if(authorizationHeader != null) {
			token = authorizationHeader.replace("Bearer ", "");
			String subject =  this.tokenService.getSubject(token);
			
			Usuario usuario = this.usuarioRepository.findByLogin(subject);
			
			UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(usuario, null, usuario.getAuthorities());
			
			SecurityContextHolder.getContext().setAuthentication(authentication);
		}
		
		filterChain.doFilter(request, response);
		
	}

}

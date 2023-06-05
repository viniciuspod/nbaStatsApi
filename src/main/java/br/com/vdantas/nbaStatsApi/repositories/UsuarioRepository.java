package br.com.vdantas.nbaStatsApi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.vdantas.nbaStatsApi.model.Usuario;

@Repository
public interface UsuarioRepository  extends CrudRepository<Usuario, Long>{

	Usuario findByLogin(String login);
}

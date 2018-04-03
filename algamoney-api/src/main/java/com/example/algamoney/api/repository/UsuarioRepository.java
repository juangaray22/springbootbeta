package com.example.algamoney.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Usuario;

/**
 * 
 * @author Juan
 *
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findbyEmail(String email);
}

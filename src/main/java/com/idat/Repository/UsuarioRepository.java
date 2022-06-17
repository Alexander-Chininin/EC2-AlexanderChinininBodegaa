package com.idat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	Usuario findByUsuario(String usuario);
}

package com.idat.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.idat.dto.Request.UsuarioRegistrar;
import com.idat.Repository.UsuarioRepository;
import com.idat.modelo.Usuario;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	UsuarioRepository repo;

	@Override
	public void registrar(UsuarioRegistrar usuario) {
		// TODO Auto-generated method stub
		Usuario _usuario = new Usuario();
		
		_usuario.setPassword(usuario.getPassword());
		_usuario.setRol(usuario.getRol());
		_usuario.setUsuario(usuario.getUsuario());
		repo.save(_usuario);
	}

	@Override
	public void actualizar(Usuario usuario) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub	
	}

	@Override
	public Usuario buscarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}
}

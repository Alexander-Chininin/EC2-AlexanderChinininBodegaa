package com.idat.Service;

import com.idat.dto.Request.UsuarioRegistrar;
import com.idat.modelo.Usuario;
import java.util.List;

public interface UsuarioService {

	public void registrar(UsuarioRegistrar usuario);
	public void actualizar(Usuario usuario);
	public void eliminar(Integer id);
	public  Usuario buscarId(Integer id);
	public List<Usuario> listar();
}

package com.idat.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.idat.dto.Request.ProductoActualizar;
import com.idat.dto.Request.ProductoRegistrar;
import com.idat.dto.Request.UsuarioRegistrar;
import com.idat.modelo.Productos;
import com.idat.modelo.Usuario;
import com.idat.Repository.ProductoRepository;

public interface ProductosService {
	public void registrar(ProductoRegistrar producto);
	public void actualizar(ProductoActualizar producto);
	public void eliminar(Integer id);
	public  Productos buscarId(Integer id);
	public List<Productos> listar();
}
package com.idat.Service;

import java.util.List;

import com.idat.dto.Request.BodegaActualizar;
import com.idat.dto.Request.BodegaRegistrar;
import com.idat.dto.Request.ClienteActualizar;
import com.idat.dto.Request.ClienteRegistrar;
import com.idat.dto.ClienteDTO;
import com.idat.modelo.Bodega;

public interface BodegaService {
	public void registo(BodegaRegistrar bodega);
	public void actualizarBodega(BodegaActualizar bodega);
	public List<Bodega> listar();
	public Bodega  buscarId(Integer id);
	public void eliminar(Integer id);
}

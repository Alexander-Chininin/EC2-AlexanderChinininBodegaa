package com.idat.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.idat.dto.Request.BodegaActualizar;
import com.idat.dto.Request.BodegaRegistrar;
import com.idat.modelo.Bodega;
import com.idat.modelo.Productos;
import com.idat.Repository.BodegaRepository;
import com.idat.Repository.ProductoRepository;

@Service
public class BodegaServiceImpl implements BodegaService {

	@Autowired
	BodegaRepository repo;
	@Autowired
	ProductoRepository repoP;
	
	@Override
	public void registo(BodegaRegistrar bodega) {
		Bodega _bodega = new Bodega();
		_bodega.setDireccion(bodega.getDireccion());
		_bodega.setNombre(bodega.getNombre());
		Optional<Productos> productos = repoP.findById(bodega.getIdProducto());
		_bodega.setProducto(productos.get());
		repo.save(_bodega);
	}

	@Override
	public void actualizarBodega(BodegaActualizar bodega) {
		Bodega _bodega = new Bodega();
		_bodega.setDireccion(bodega.getDireccion());
		_bodega.setNombre(bodega.getNombre());
		Optional<Productos> productos = repoP.findById(bodega.getIdProducto());
		_bodega.setProducto(productos.get());
		_bodega.setIdBodega(bodega.getIdBodega());
		repo.saveAndFlush(_bodega);
		
	}

	@Override
	public List<Bodega> listar() {
		return repo.findAll();
	}

	@Override
	public Bodega buscarId(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
}

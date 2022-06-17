package com.idat.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.idat.dto.Request.ProductoActualizar;
import com.idat.dto.Request.ProductoRegistrar;
import com.idat.modelo.Productos;
import com.idat.Repository.ProductoRepository;

@Service
public class ProductosServiceImpl implements ProductosService {
	
	@Autowired
	ProductoRepository repo;
	@Override
	public void registrar(ProductoRegistrar producto) {
		Productos _producto = new Productos();
		_producto.setDescripcion(producto.getDescripcion());
		_producto.setPrecio(producto.getPrecio());
		_producto.setProducto(producto.getProducto());
		_producto.setStock(producto.getStock());
		repo.save(_producto);
		
	}

	@Override
	public void actualizar(ProductoActualizar producto) {
		Productos _producto = new Productos();
		_producto.setDescripcion(producto.getDescripcion());
		_producto.setPrecio(producto.getPrecio());
		_producto.setProducto(producto.getProducto());
		_producto.setStock(producto.getStock());
		_producto.setIdProducto(producto.getIdProducto());
		repo.save(_producto);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Productos buscarId(Integer id) {
		Optional<Productos> _producto = repo.findById(id);
		return _producto.get();
	}

	@Override
	public List<Productos> listar() {
		return repo.findAll();
	}	
}

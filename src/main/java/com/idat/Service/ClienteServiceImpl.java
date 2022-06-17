package com.idat.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.idat.dto.Request.ClienteActualizar;
import com.idat.dto.Request.ClienteRegistrar;
import com.idat.dto.ClienteDTO;
import com.idat.modelo.Cliente;
import com.idat.Repository.ClienteRepository;

@Service
public class ClienteServiceImpl {

	@Autowired
	ClienteRepository repo;

	@Override
	public void registarCliente(ClienteRegistrar cliente) {
		// TODO Auto-generated method stub
		
		Cliente _cliente = new Cliente();
		_cliente.setDireccion(cliente.getDireccionDTO());
		_cliente.setDni(cliente.getDniDTO());
		_cliente.setNombre(cliente.getNombreDTO());
		repo.save(_cliente);
		
	}

	@Override
	public void actualizarCliente(ClienteActualizar cliente) {
		// TODO Auto-generated method stub
		Cliente _cliente = new Cliente();
		_cliente.setDireccion(cliente.getDireccionDTO());
		_cliente.setDni(cliente.getDniDTO());
		_cliente.setNombre(cliente.getNombreDTO());
		_cliente.setIdCliente(cliente.getIdClienteDTO());
		repo.saveAndFlush(_cliente);
		
		
	}

	@Override
	public List<ClienteDTO> listarClientes() {
		// TODO Auto-generated method stub
		List<ClienteDTO> clienteDTOlist = new ArrayList<>();
		ClienteDTO _cliente = null;
		
		if(repo.findAll().size()==0) {
			return clienteDTOlist;
		}
		for(Cliente cliente : repo.findAll()) {
			_cliente = new ClienteDTO();
			_cliente.setDireccionDTO(cliente.getDireccion());
			_cliente.setDniDTO(cliente.getDni());
			_cliente.setNombreDTO(cliente.getNombre());
			_cliente.setIdClienteDTO(cliente.getIdCliente());
			clienteDTOlist.add(_cliente);
		}
		
		return clienteDTOlist;
	}

	@Override
	public ClienteDTO buscarCliente(Integer id) {
		Optional<Cliente> cliente = repo.findById(id);
		ClienteDTO _cliente = new ClienteDTO();
		_cliente = new ClienteDTO();
		_cliente.setDireccionDTO(cliente.get().getDireccion());
		_cliente.setDniDTO(cliente.get().getDni());
		_cliente.setNombreDTO(cliente.get().getNombre());
		_cliente.setIdClienteDTO(cliente.get().getIdCliente());
		return _cliente;
	}
	
	@Override
	public void eliminar(Integer id) {
	repo.deleteById(id);	
	}
}

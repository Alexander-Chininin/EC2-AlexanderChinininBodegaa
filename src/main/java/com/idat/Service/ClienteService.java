package com.idat.Service;

import java.util.List;

import com.idat.dto.Request.ClienteActualizar;
import com.idat.dto.Request.ClienteRegistrar;
import com.idat.dto.ClienteDTO;

public interface ClienteService {

	public void registarCliente(ClienteRegistrar cliente);
	public void actualizarCliente(ClienteActualizar cliente);
	public List<ClienteDTO> listarClientes();
	public ClienteDTO  buscarCliente(Integer id);
}

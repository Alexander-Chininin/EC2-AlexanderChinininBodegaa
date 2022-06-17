package com.idat.dto.Request;

public class ClienteRegistrar {

	private String nombreDTO;
	private String direccionDTO;
	private String dniDTO;
	
	public ClienteRegistrar() {
	}
	
	public String getNombreDTO() {
		return nombreDTO;
	}
	
	public void setNombreDTO(String nombreDTO) {
		this.nombreDTO = nombreDTO;
	}
	
	public String getDireccionDTO() {
		return direccionDTO;
	}
	
	public void setDireccionDTO(String direccionDTO) {
		this.direccionDTO = direccionDTO;
	}
	
	public String getDniDTO() {
		return dniDTO;
	}
	
	public void setDniDTO(String dniDTO) {
		this.dniDTO = dniDTO;
	}
}

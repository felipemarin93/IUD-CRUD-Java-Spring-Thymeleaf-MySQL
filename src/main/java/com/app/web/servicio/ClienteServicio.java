package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Cliente;

public interface ClienteServicio {

	public List<Cliente> listarTodosLosClientes();
	
	public Cliente guardarCliente(Cliente cliente);
	
	public Cliente obtenerClientePorId(Long id);
	
	public Cliente actualizarCliente(Cliente cliente);
	
	public void eliminarCliente(Long id);
}

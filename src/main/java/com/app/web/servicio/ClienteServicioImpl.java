package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.repositorio.ClienteRepositorio;

@Service
public class ClienteServicioImpl implements ClienteServicio {

	@Autowired
	private ClienteRepositorio repositorio;

	@Override
	public List<Cliente> listarTodosLosClientes() {
		return repositorio.findAll();
	}

	@Override
	public Cliente guardarCliente(Cliente cliente) {
		return repositorio.save(cliente);
	}

	@Override
	public Cliente obtenerClientePorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		return repositorio.save(cliente);
	}

	@Override
	public void eliminarCliente(Long id) {
		repositorio.deleteById(id);

	}

}

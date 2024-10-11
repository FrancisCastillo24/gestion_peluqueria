package com.example.demo.service;

import java.util.List;

import java.util.Optional;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;

@Service
public class ClienteService implements IClienteService{

	private ClienteRepository clienteRepo;
	@Override
	public Cliente create(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteRepo.save(cliente);
	}

	@Override
	public Cliente update(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteRepo.save(cliente);
	}

	@Override
	public Cliente findById(Integer id) {
		// Lo almaceno en un objeto opcional debido a que es posible que no exista en la base de datos
		Optional<Cliente> clienteOptional = clienteRepo.findById(id);
		
		// Si no existe en la base de datos retorna null
		return clienteOptional.orElse(null);
	}

	@Override
	public List<Cliente> findAll() {
		// Devuelve todos los clientes registrados
		return clienteRepo.findAll();
	}

	@Override
	public void delete(Integer id) {
		clienteRepo.deleteById(id);
	}

}

package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Cliente;

public interface IClienteService {
 Cliente create(Cliente cliente);
 Cliente update(Cliente cliente);
 Cliente findById(Integer id);
 List<Cliente> findAll();
 void delete(Integer id);
}

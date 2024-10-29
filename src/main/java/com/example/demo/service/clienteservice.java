package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.cliente;

public interface clienteservice { 
cliente create(cliente a);
cliente update(cliente a);
void  delete(Long id);
Optional<cliente>read(Long id);
List<cliente>readAll();
}

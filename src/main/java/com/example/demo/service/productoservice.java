package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.producto;


public interface productoservice {
	producto create(producto a);
	producto update(producto a);
	void  delete(Long id);
	Optional<producto>read(Long id);
	List<producto>readAll();
}

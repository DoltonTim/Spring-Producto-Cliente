package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.productodao;
import com.example.demo.entity.producto;
import com.example.demo.repository.productorepository;
@Component
public class productodaoImpl implements productodao {
  @Autowired
  private productorepository repository;
	@Override
	public producto create(producto a) {
		
		return repository.save(a);
	}

	@Override
	public producto update(producto a) {
	
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
	
		repository.deleteById(id);
	}

	@Override
	public Optional<producto> read(Long id) {
	
		return repository.findById(id);
	}

	@Override
	public List<producto> readAll() {
		
		return  repository.findAll();
	}

}

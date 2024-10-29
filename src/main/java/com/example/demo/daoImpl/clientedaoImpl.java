package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.clientedao;
import com.example.demo.entity.cliente;
import com.example.demo.repository.clienterepository;




@Component
public class clientedaoImpl implements clientedao {
	
   @Autowired
   private clienterepository repository;
	@Override
	public cliente create(cliente a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public cliente update(cliente a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<cliente> read(Long id) {
		// TODO Auto-generated method stub
		return  repository.findById(id);
	}

	@Override
	public List<cliente> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
	
}

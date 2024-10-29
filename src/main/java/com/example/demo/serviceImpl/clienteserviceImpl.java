package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.clientedao;
import com.example.demo.entity.cliente;
import com.example.demo.service.clienteservice;

@Service
public class clienteserviceImpl implements clienteservice{
  @Autowired
  private clientedao dao;
	@Override
	public cliente create(cliente a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public cliente update(cliente a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<cliente> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<cliente> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

	

}

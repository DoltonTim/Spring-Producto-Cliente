package com.example.demo.serviceImpl;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dao.productodao;
import com.example.demo.entity.producto;
import com.example.demo.service.productoservice;
@Service
public class productoserviceImpl implements productoservice{
	
	  @Autowired
	  private productodao dao;
		@Override
		public producto create(producto a) {
			// TODO Auto-generated method stub
			return dao.create(a);
		}

		@Override
		public producto update(producto a) {
			// TODO Auto-generated method stub
			return dao.update(a);
		}

		@Override
		public void delete(Long id) {
			// TODO Auto-generated method stub
			dao.delete(id);
		}

		@Override
		public Optional<producto> read(Long id) {
			// TODO Auto-generated method stub
			return dao.read(id);
		}

		@Override
		public List<producto> readAll() {
			// TODO Auto-generated method stub
			return dao.readAll();
		}


}

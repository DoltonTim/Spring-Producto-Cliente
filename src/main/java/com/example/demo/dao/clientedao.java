package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.cliente;
@Repository
public interface clientedao {
cliente create(cliente a);
cliente  update(cliente a);
void delete(Long id);
Optional<cliente>read(Long id);
List<cliente>readAll();

}

package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.producto;
@Repository
public interface productorepository extends JpaRepository<producto,Long>{

}

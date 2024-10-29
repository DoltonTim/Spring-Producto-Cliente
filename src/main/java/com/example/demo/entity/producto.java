package com.example.demo.entity;



import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@CrossOrigin
@Table(name="producto")
public class producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombres", length = 100)
	private String nombres;
    @Column(name = "precio", length = 100)
	 private double precio;
    @Column(name = "categoria", length = 100)
    private String categoria;
    @Column(name = "descripcion", length = 255)
    private  String descripcion;
    @Column(name = "estado")
    private String estado;
    
	
}

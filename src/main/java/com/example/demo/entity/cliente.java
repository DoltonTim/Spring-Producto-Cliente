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
@Table(name ="cliente")
public class cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombres", length = 100)
	private String nombres;
	@Column(name = "apellidos", length = 100)
	private String apellidos;
	@Column(name="dni", length =100)
	private String dni;
	


	
}

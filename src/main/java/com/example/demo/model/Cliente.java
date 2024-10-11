package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "cliente")

public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombre", nullable = false, length = 70)
	private String nombre;
	
	@Column(name = "apellidos", nullable = false, length = 70)
	private String apellidos;
	
	@Column(name = "phone", nullable = true, length = 9)
	private String phone;
	
	@Column(name = "email", nullable = false, length = 100)
	private String email;

	// Generamos los Getter y Setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

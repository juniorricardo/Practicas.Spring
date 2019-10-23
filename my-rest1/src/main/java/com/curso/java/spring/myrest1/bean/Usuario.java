package com.curso.java.spring.myrest1.bean;

public class Usuario {
	
	private String nombre;
	private String apellido;
	private String email;
	private String contrasenia;

	public String getFirstName() {
		return nombre;
	}

	public void setFirstName(String nombre) {
		this.nombre = nombre;
	}

	public String getLastName() {
		return apellido;
	}

	public void setLastName(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return contrasenia;
	}

	public void setPassword(String contrasenia) {
		this.contrasenia = contrasenia;
	}

}
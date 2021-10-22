package com.jpgarcia.arquitectura.springmongodb.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Bike implements Serializable{

	private static final long serialVersionUID = -2646530418139639977L;
	
	@Id
	String id;
	String color;
	String modelo;
	String latitud;
	String longitud;
	
	public Bike(String id, String color, String modelo, String latitud, String longitud) {
		super();
		this.id = id;
		this.color = color;
		this.modelo = modelo;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	public Bike() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getLatitud() {
		return latitud;
	}
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	
	

}

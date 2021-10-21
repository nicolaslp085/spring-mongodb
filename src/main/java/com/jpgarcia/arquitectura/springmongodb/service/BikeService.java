package com.jpgarcia.arquitectura.springmongodb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.jpgarcia.arquitectura.springmongodb.entity.Bike;

@Service
public class BikeService {
	
	public String saveBike(@RequestBody Bike bike) {
		
		return "Bike added successfully";
	}
	
	public List<Bike> getBike(){
		Bike bike1 = new Bike("1", "Negro", "Ruta", "234234", "234324");
		Bike bike2 = new Bike("2", "Rojo", "Montaña", "234234", "234324");
		Bike bike3 = new Bike("3", "Morado", "Cross", "234234", "234324");
		
		List<Bike> lista = new ArrayList<>();
		lista.add(bike1);
		lista.add(bike2);
		lista.add(bike3);
		return lista;
	}
	
	
	public Bike getBike(@PathVariable String id){
		Bike bike1 = new Bike("1", "Negro", "Ruta", "234234", "234324");
		return bike1;
	}
	
	
	public String deleteBike(@PathVariable String id) {
		
		return "Deleted Bike Successfully : " + id;
	}

}

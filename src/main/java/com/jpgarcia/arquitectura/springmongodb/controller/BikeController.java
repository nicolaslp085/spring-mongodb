package com.jpgarcia.arquitectura.springmongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpgarcia.arquitectura.springmongodb.entity.Bike;
import com.jpgarcia.arquitectura.springmongodb.service.BikeService;

@RestController
@RequestMapping("/api")
public class BikeController {
	
	@Autowired
	private BikeService bikeService;
	
	@PostMapping("/addBike")
	public String saveBike(@RequestBody Bike bike) {
		bikeService.saveBike(bike);
		return "Bike added successfully : " + bike.getId();
	}
	
	@GetMapping("/findAllBikes")
	public List<Bike> getBike(){
		List<Bike> lista = bikeService.getBike();
		return lista;
	}
	
	@GetMapping("/findBike/{id}")
	public Bike getBike(@PathVariable String id){
		return bikeService.getBike(id);
	}
	
	@DeleteMapping("/deleteBike/{id}")
	public String deleteBike(@PathVariable String id) {
		bikeService.deleteBike(id);
		return "Deleted Bike Successfully : " + id;
	}
	
	@GetMapping("/hola")
    public String hola(@RequestParam(value = "nombre", defaultValue = "Mundo") String nombre) {
        return String.format("Hola %s!", nombre);
    }

}

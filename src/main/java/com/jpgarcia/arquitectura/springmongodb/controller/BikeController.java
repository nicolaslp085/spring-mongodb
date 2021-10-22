package com.jpgarcia.arquitectura.springmongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/addBike")
	public String saveBike() {
		return bikeService.saveBike();
	}
	
	@GetMapping("/findAllBikes")
	public List<Bike> getBike(){
		List<Bike> lista = bikeService.getBike();
		return lista;
	}
	
	@GetMapping("/findBike/{id}")
	public String getBike(@PathVariable String id){
		return bikeService.getBike(id).getModelo();
	}
	
	@GetMapping("/deleteBike/{id}")
	public String deleteBike(@PathVariable String id) {
		return bikeService.deleteBike(id);
	}
	
	@GetMapping("/hola")
    public String hola(@RequestParam(value = "nombre", defaultValue = "Mundo") String nombre) {
        return String.format("Hola %s!", nombre);
    }

}

package com.jpgarcia.arquitectura.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jpgarcia.arquitectura.springmongodb.entity.Bike;

public interface BikeRepository extends MongoRepository<Bike, String>{

}

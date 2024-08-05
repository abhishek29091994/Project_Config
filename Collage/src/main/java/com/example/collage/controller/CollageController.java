package com.example.collage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.collage.Entity.Collage;
import com.example.collage.service.CollaseService;

@RestController
public class CollageController {
	
	@Autowired
	private CollaseService service;
	
	@PostMapping("/inserCollage")
	public ResponseEntity<Collage> saveCollage(@RequestBody Collage collage){
		Collage collage1=service.insertCOllage(collage);
		return ResponseEntity.ok().body(collage1);
	}

}

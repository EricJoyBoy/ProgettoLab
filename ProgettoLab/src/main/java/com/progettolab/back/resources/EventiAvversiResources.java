package com.progettolab.back.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.progettolab.back.domain.EventiAvversi;
import com.progettolab.back.service.EventiAvversiService;

@RestController
@RequestMapping(value="/eventiavversi")
public class EventiAvversiResources {
	
	@Autowired
	private EventiAvversiService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<EventiAvversi> FindById(@PathVariable Integer id){
		
		EventiAvversi obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<EventiAvversi> create(@RequestBody EventiAvversi obj){
		obj =service.create(obj);
		URI uri= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
		
	}
	
	
	
	
	@PutMapping(value="/{id}")
	public ResponseEntity<EventiAvversi> update(@PathVariable Integer id, EventiAvversi obj){
		
		EventiAvversi newObj = service.update(id,obj);
		
		return ResponseEntity.ok().body(new EventiAvversi());
	}


}

package com.progettolab.back.resources;


import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.progettolab.back.domain.CittadiniRegistrati;
import com.progettolab.back.service.CittadiniRegistratiService;


@RestController
@RequestMapping(value="/cittadiniregistrati")
public class CittadiniRegistratiResource {
	
	@Autowired
	private CittadiniRegistratiService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<CittadiniRegistrati> FindById(@PathVariable Integer id){
		
		CittadiniRegistrati obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<CittadiniRegistrati> create(@RequestBody CittadiniRegistrati obj){
		obj =service.create(obj);
		URI uri= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
		
	}
	
	
	
	
	@PutMapping(value="/{id}")
	public ResponseEntity<CittadiniRegistrati> update(@PathVariable Integer id, CittadiniRegistrati obj){
		
		CittadiniRegistrati newObj = service.update(id,obj);
		
		return ResponseEntity.ok().body(new CittadiniRegistrati());
	}

}

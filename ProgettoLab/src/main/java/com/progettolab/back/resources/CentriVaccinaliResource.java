package com.progettolab.back.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.progettolab.back.CentriVaccinali;
import com.progettolab.back.service.CentriVaccinaliService;

@RestController
@RequestMapping(value="/centrivaccinali")
public class CentriVaccinaliResource {

	@Autowired
	private CentriVaccinaliService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<CentriVaccinali> FindById(@PathVariable Integer id){
		
		CentriVaccinali obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<CentriVaccinali> create(@RequestBody CentriVaccinali obj){
		obj =service.create(obj);
		URI uri= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
		
	}
	
	
	
	
	@PutMapping(value="/{id}")
	public ResponseEntity<CentriVaccinali> update(@PathVariable Integer id, CentriVaccinali obj){
		
		CentriVaccinali newObj = service.update(id,obj);
		
		return ResponseEntity.ok().body(new CentriVaccinali());
	}

}
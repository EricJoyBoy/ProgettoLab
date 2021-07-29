package com.progettolab.back.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.progettolab.back.domain.VaccinatiRegistrati;
import com.progettolab.back.domain.VaccinatiRegistrati;
import com.progettolab.back.dtos.VaccinatiRegistratiDTO;
import com.progettolab.back.service.VaccinatiRegistratiService;

@RestController
@RequestMapping(value="/vaccinatiregistrati")
public class VaccinatiRegistratiResources {
	
	@Autowired
	private VaccinatiRegistratiService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<VaccinatiRegistrati> FindById(@PathVariable Integer id){
		
		VaccinatiRegistrati obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<VaccinatiRegistrati> create(@RequestBody VaccinatiRegistrati obj){
		obj =service.create(obj);
		URI uri= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
		
	}
	
	
	
	
	@PutMapping(value="/{id}")
	public ResponseEntity<VaccinatiRegistrati> update(@PathVariable Integer id, VaccinatiRegistrati obj){
		
		VaccinatiRegistrati newObj = service.update(id,obj);
		
		return ResponseEntity.ok().body(new VaccinatiRegistrati());
	}
	
	@GetMapping
	public ResponseEntity<List<VaccinatiRegistratiDTO>> findAll(){
		List<VaccinatiRegistrati> list = service.findAll();
		List<VaccinatiRegistratiDTO> listDTO=list.stream().map(obj-> new VaccinatiRegistratiDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}


}

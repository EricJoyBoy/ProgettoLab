package com.progettolab.back.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progettolab.back.domain.CentriVaccinali;
import com.progettolab.back.domain.CittadiniRegistrati;
import com.progettolab.back.repository.CittadiniRegistratiRepository;
import com.progettolab.back.service.exceptions.ObjectNotFoundException;

@Service
public class CittadiniRegistratiService {

	@Autowired
	private CittadiniRegistratiRepository repository;
	
	

	public CittadiniRegistrati findById(Integer id) {
		// TODO Auto-generated method stub
		Optional<CittadiniRegistrati> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Oggeto non trovato! id: "+ id + "tipo : "+ CittadiniRegistrati.class.getName()));
	}
	
	
	public CittadiniRegistrati create (CittadiniRegistrati obj) {
		obj.setId(null);
		return repository.save(obj);
	}


	public CittadiniRegistrati update(Integer id, CittadiniRegistrati obj) {
		// TODO Auto-generated method stub
		CittadiniRegistrati obj1 =findById(id);
		obj1.setNome(obj.getNome());
		obj1.setCodiceFiscale(obj.getCodiceFiscale());
		obj1.setEmail(obj.getEmail());
		obj1.setUserId(obj.getUserId());
		obj1.setPassword(obj.getPassword());
		obj1.setIdUnivoco(obj.getIdUnivoco());
	
		return repository.save(obj);
		
		}
	
	public List<CittadiniRegistrati> findAll(){
		return repository.findAll();
	}
	
	
}

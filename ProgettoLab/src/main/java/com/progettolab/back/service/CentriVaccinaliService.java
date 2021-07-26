package com.progettolab.back.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progettolab.back.domain.CentriVaccinali;
import com.progettolab.back.repository.CentriVaccinaliRepository;
import com.progettolab.back.service.exceptions.ObjectNotFoundException;

@Service
public class CentriVaccinaliService {

	@Autowired
	private CentriVaccinaliRepository repository;
	
	

	public CentriVaccinali findById(Integer id) {
		// TODO Auto-generated method stub
		Optional<CentriVaccinali> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Oggeto non trovato! id: "+ id + "tipo : "+ CentriVaccinali.class.getName()));
	}
	
	
	public CentriVaccinali create (CentriVaccinali obj) {
		obj.setId(null);
		return repository.save(obj);
	}


	public CentriVaccinali update(Integer id, CentriVaccinali obj) {
		// TODO Auto-generated method stub
		CentriVaccinali obj1 =findById(id);
		obj1.setCap(obj.getCap());
		obj1.setComune(obj.getComune());
		obj1.setNome(obj.getNome());
		obj1.setNomeCentro(obj.getNomeCentro());
		obj1.setNumeroCivico(obj.getNumeroCivico());
		obj1.setQualificatore(obj.getQualificatore());
		obj1.setSiglaProvincia(obj.getSiglaProvincia());
		obj1.setTipologia(obj.getTipologia());
		return repository.save(obj);
		
		}
	
	public List<CentriVaccinali> findAll(){
		return repository.findAll();
	}
}

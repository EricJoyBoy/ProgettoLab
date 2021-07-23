package com.progettolab.back.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progettolab.back.domain.VaccinatiRegistrati;
import com.progettolab.back.repository.VaccinatiRegistratiRepository;
import com.progettolab.back.service.exceptions.ObjectNotFoundException;

@Service
public class VaccinatiRegistratiService {
	
	@Autowired
	private VaccinatiRegistratiRepository repository;
	
	

	public VaccinatiRegistrati findById(Integer id) {
		// TODO Auto-generated method stub
		Optional<VaccinatiRegistrati> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Oggeto non trovato! id: "+ id + "tipo : "+ VaccinatiRegistrati.class.getName()));
	}
	
	
	public VaccinatiRegistrati create (VaccinatiRegistrati obj) {
		obj.setId(null);
		return repository.save(obj);
	}


	public VaccinatiRegistrati update(Integer id, VaccinatiRegistrati obj) {
		// TODO Auto-generated method stub
		VaccinatiRegistrati obj1 =findById(id);
		obj1.setNome(obj.getNome());
		obj1.setCodiceFiscale(obj.getCodiceFiscale());
		obj1.setData(obj.getData());
		obj1.setVaccino(obj.getVaccino());
		obj1.setNomeCentro(obj.getNomeCentro());
		obj1.setIdUnivoco(obj.getIdUnivoco());
	
		return repository.save(obj);
		
		}

}

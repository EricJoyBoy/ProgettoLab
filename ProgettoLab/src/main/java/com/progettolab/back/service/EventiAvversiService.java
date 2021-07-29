package com.progettolab.back.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progettolab.back.domain.CittadiniRegistrati;
import com.progettolab.back.domain.EventiAvversi;
import com.progettolab.back.repository.EventiAvversiRepository;
import com.progettolab.back.service.exceptions.ObjectNotFoundException;

@Service
public class EventiAvversiService {
	
	@Autowired
	private EventiAvversiRepository repository;
	
	

	public EventiAvversi findById(Integer id) {
		// TODO Auto-generated method stub
		Optional<EventiAvversi> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Oggeto non trovato! id: "+ id + "tipo : "+ EventiAvversi.class.getName()));
	}
	
	
	public EventiAvversi create (EventiAvversi obj) {
		obj.setId(null);
		return repository.save(obj);
	}


	public EventiAvversi update(Integer id, EventiAvversi obj) {
		// TODO Auto-generated method stub
		EventiAvversi obj1 =findById(id);
		obj1.setEvento(obj.getEvento());
		obj1.setSeverita(obj.getSeverita());
		obj1.setNoteOpzionali(obj.getNoteOpzionali());
	
	
		return repository.save(obj);
		
		}
	
	
	public List<EventiAvversi> findAll(){
		return repository.findAll();
	}
	
	
}

package com.progettolab.back.service;

import com.progettolab.back.*;
import com.progettolab.back.domain.CentriVaccinali;
import com.progettolab.back.repository.CentriVaccinaliRepository;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

	
	@Autowired
	private CentriVaccinaliRepository centrivaccinalirepository;
	
	public void instanziaBaseDiDati() {
		
		CentriVaccinali c1= new CentriVaccinali(null,"Test", "per", "vedere", "se", "funzione", "il ", "progetto", "piu bello del mondo");
		
		
		centrivaccinalirepository.saveAll(Arrays.asList(c1));
		
	}
}

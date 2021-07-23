package com.progettolab.back.repository;

import com.progettolab.back.domain.CentriVaccinali;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface CentriVaccinaliRepository extends JpaRepository<CentriVaccinali,Integer> {

}

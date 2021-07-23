package com.progettolab.back.repository;

import com.progettolab.back.domain.VaccinatiRegistrati;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface VaccinatiRegistratiRepository extends JpaRepository<VaccinatiRegistrati,Integer> {

}

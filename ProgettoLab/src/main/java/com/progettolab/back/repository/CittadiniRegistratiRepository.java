package com.progettolab.back.repository;

import com.progettolab.back.domain.CittadiniRegistrati;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface CittadiniRegistratiRepository extends JpaRepository<CittadiniRegistrati,Integer> {

}

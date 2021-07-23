package com.progettolab.back.repository;


import com.progettolab.back.domain.EventiAvversi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface EventiAvversiRepository extends JpaRepository<EventiAvversi,Integer>{

}

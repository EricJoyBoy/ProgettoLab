package com.progettolab.back;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface EventiAvversiRepository extends JpaRepository<EventiAvversi,Integer>{

}

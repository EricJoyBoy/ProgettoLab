package com.progettolab.back.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.progettolab.back.service.*;

import org.springframework.context.annotation.Bean;

import org.springframework.beans.factory.annotation.Value;


@Configuration
@Profile("dev")
public class DevConfig {


	
	@Autowired
	private DBService dbservice;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;

	@Bean
	public boolean instanziaBaseDiDati() {
		if(strategy.equals("create")) {
			this.dbservice.instanziaBaseDiDati();
		}
		return false;
	}
	
	
	
}



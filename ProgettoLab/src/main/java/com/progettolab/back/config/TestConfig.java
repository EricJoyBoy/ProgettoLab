package com.progettolab.back.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.progettolab.back.service.*;

import org.springframework.context.annotation.Bean;

@Configuration
@Profile("test")
public class TestConfig {

	
	@Autowired
	private DBService dbservice;
	
	@Bean
	public void instaziareBaseDiDati() {
		this.dbservice.instanziaBaseDiDati();
	}
}

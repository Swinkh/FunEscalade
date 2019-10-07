package com.jonathanweb.funescalade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.jonathanweb.funescalade.service.UtilisateurDao;

import com.jonathanweb.funescalade.model.Utilisateur;




@SpringBootApplication
public class FunEscaladeApplication  {
	
	private static final Logger logger = LoggerFactory.getLogger(FunEscaladeApplication.class);
	
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(FunEscaladeApplication.class, args);
		logger.info("Start FunEscaladeAplication GO! ...");
		
	}




		
	}

	


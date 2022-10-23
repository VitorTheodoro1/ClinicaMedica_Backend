package com.api.clinicamedica.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.clinicamedica.models.BaseDeEnderecosModel;


@Service
public class ClinicaMedicaService {
	
	 @PersistenceContext
	  private EntityManager entityManager;

    @Transactional
	public BaseDeEnderecosModel salvar(BaseDeEnderecosModel baseDeEnderecosModel) {
    	
    	 entityManager.persist(baseDeEnderecosModel);
    	 
		return baseDeEnderecosModel;
	}

}

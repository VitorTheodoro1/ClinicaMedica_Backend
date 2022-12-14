package com.api.clinicamedica.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.clinicamedica.models.BaseDeEnderecosModel;
import com.api.clinicamedica.models.FuncionarioModel;
import com.api.clinicamedica.models.PacienteModel;

@Service
public class FuncionarioService {
	

	 @PersistenceContext
	  private EntityManager entityManager;

   @Transactional
	public FuncionarioModel salvar(FuncionarioModel funcionarioModel) {
   	
	   entityManager.persist(funcionarioModel);
	   
		return funcionarioModel;
	}
   
   public List<FuncionarioModel> findAll() {
		String jpql = "SELECT p FROM FuncionarioModel p";
		TypedQuery<FuncionarioModel> query = entityManager.createQuery(jpql, FuncionarioModel.class);
		List<FuncionarioModel> test = query.getResultList();
		return test;
	}

}

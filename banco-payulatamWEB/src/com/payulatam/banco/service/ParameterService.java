package com.payulatam.banco.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.payulatam.banco.entity.ParameterEntity;

@Repository("parameterService")
public class ParameterService {

	@PersistenceContext
	private EntityManager em;

	@PostConstruct
	public void init() {
	}

	public List<ParameterEntity> findAllParameters() {

		@SuppressWarnings("unchecked")
		List<ParameterEntity> parameters = (List<ParameterEntity>) em.createNamedQuery(
				"ParameterEntity.findAllParameters").getResultList();

		return parameters;
	}

}
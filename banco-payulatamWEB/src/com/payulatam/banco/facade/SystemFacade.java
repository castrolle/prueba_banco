package com.payulatam.banco.facade;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payulatam.banco.entity.ParameterEntity;
import com.payulatam.banco.service.ParameterService;

/**
 * Clase que encapsula la lógica de negocio
 * 
 * @author oi.estrada@uniandes.edu.co
 * 
 */
@Service("systemFacade")
public class SystemFacade {

	@Autowired
	private ParameterService parameterService;

	@PostConstruct
	public void init() throws Exception {
	}

	@PreDestroy
	public void destroy() {
	}

	/*
	 * ******************************************************************************************************************************
	 * Servicios relacionados con los parametros del sistema
	 * ******************************************************************************************************************************
	 */
	public List<ParameterEntity> findAllParameters() {
		return parameterService.findAllParameters();
	}

}
package com.payulatam.banco.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "PARAMETER")
@NamedQueries(value = { @NamedQuery(name = "ParameterEntity.findAllParameters", query = "SELECT p FROM ParameterEntity p") })
public class ParameterEntity implements Serializable {

	@Id
	@Column(name = "parameter_id")
	private long parameterId;

	@Column(name = "name", nullable = false, length = 30)
	private String name;

	@Column(name = "value", nullable = false, length = 500)
	private String value;

	@Column(name = "description", length = 50)
	private String description;

	public ParameterEntity() {
	}

	public long getParameterId() {
		return parameterId;
	}

	public void setParameterId(long parameterId) {
		this.parameterId = parameterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
package com.cibertec.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_department")
public class Department {
	@Id
	@Column (name = "dpt_id")
	private int id;
	@Column (name = "dpt_department")
	private String department;
	
	// Este es el foreing key
	@OneToMany
	@JoinColumn(name = "dpt_id", insertable = false, updatable = false)
	private List<Department> lstDepartment;
	
}

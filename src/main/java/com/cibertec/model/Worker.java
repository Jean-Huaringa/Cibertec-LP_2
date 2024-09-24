package com.cibertec.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_worker")
public class Worker {
	@Id
	private Date dateContract;
	private Double salary;
	

	// Este es el foreing key
	@OneToMany
	@JoinColumn(name = "hrs_id", insertable = false, updatable = false)
	private List<WorkingHours> lstWorkingHours;

	// Este es el foreing key
	@OneToMany
	@JoinColumn(name = "dpt_id", insertable = false, updatable = false)
	private List<Department> lstDepartment;

	// Este es el foreing key
	@OneToMany
	@JoinColumn(name = "pst_id", insertable = false, updatable = false)
	private List<Position> lstPosition;

	// Este es el foreing key
	@OneToMany
	@JoinColumn(name = "usr_id", insertable = false, updatable = false)
	private List<User> lstUser;
}

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
@Table(name = "tb_ticket")
public class Ticket {
	// Preguntar al profesor como seria con una llave compuesta
	@Id
	private int id;
	private Date date;
	private String district;
	private String address;
	

	// Este es el foreing key
	@OneToMany
	@JoinColumn(name = "usr_id", insertable = false, updatable = false)
	private List<User> lstUser;
	

	// Este es el foreing key
	@OneToMany
	@JoinColumn(name = "wrk_id", insertable = false, updatable = false)
	private List<Worker> lstWorker;
}

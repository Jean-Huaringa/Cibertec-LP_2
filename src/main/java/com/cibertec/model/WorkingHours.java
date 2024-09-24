package com.cibertec.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_working_hours")
public class WorkingHours {
	@Id
	@Column(name = "hrs_id")
	private int id;
	@Column(name = "hrs_time")
	private int time;
	@Column(name = "hrs_start_dt")
	private Date start_dt;
	@Column(name = "hrs_end_dt")
	private Date end_dt;
}

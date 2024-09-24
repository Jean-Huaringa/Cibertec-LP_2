package com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_position")
public class Position {
	@Id
	@Column(name="pst_id")
	private int id;
	@Column(name="pst_position")
	private String position;

	@ManyToOne
	@JoinColumn(name = "dpt_id", insertable = false, updatable = false)
	private Department department;
	

}

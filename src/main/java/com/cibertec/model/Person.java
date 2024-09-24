package com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_person")
public class Person {
	@Id
	@Column(name = "prs_id")
	private int id;
	@Column(name = "prs_person")
	private String person;
}

package com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "tb_material")
public class Material {
	@Id
	@Column(name = "mtr_id")
	private int id;
	@Column(name = "mtr_material")
	private String Material;
}

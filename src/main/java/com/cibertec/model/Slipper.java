package com.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_slipper")
public class Slipper {
	// Preguntar al profesor como seria con una llave compuesta
	@Id
	private String prd_id;
	private int siz_id;
	private int clr_id;
	private int stok;
	
}

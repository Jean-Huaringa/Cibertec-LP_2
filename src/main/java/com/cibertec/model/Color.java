package com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "tb_color")
public class Color {
	@Id
	@Column (name = "clr_id")
	private int id;
	@Column (name = "clr_color")
	private String color;
	
}

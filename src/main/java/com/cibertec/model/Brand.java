package com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_brand")
public class Brand {
	@Id
	@Column(name = "brd_id")
	private int id;
	@Column(name = "brd_brand")
	private String brand;
}

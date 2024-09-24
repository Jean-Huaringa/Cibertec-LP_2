package com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_size")
public class Size {
	@Id
	@Column(name = "siz_id")
	private int id;
	@Column(name = "siz_size")
	private String size;
}

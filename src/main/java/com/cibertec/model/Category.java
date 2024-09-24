package com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "tb_category")
public class Category {
	@Id
	@Column (name = "ctr_id") 
	private int id;
	@Column (name = "ctr_category")
	private String category;
}

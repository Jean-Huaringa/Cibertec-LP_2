package com.cibertec.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_product")
public class Product {
	@Id
	@Column(name = "prd_id")
	private String id;
	@Column(name = "prd_description")
	private String description;
	@Column(name = "prd_info")
	private String info;
	@Column(name = "prd_price")
	private String price;

	// Este es el foreing key
	@OneToMany
	@JoinColumn(name = "ctr_id", insertable = false, updatable = false)
	private List<Category> lstCategory;

	// Este es el foreing key
	@OneToMany
	@JoinColumn(name = "brd_id", insertable = false, updatable = false)
	private List<Brand> lstBrand;

	// Este es el foreing key
	@OneToMany
	@JoinColumn(name = "prs_id", insertable = false, updatable = false)
	private List<Person> lstPerson;

	// Este es el foreing key
	@OneToMany
	@JoinColumn(name = "mtr_id", insertable = false, updatable = false)
	private List<Material> lstMaterial;
}

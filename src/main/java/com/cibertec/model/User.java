package com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_user")
public class User {
	@Id
	@Column(name = "usr_id")
	private int id;
	@Column(name = "usr_name")
	private String name;
	@Column(name = "usr_lastname_p")
	private String lastname_p;
	@Column(name = "usr_lastname_m")
	private String lastname_m;
	@Column(name = "usr_email")
	private String email;
	@Column(name = "usr_dni")
	private String dni;
	@Column(name = "usr_phone")
	private String phone;
	@Column(name = "usr_password")
	private String password;
}

package com.insurance.bean;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	private String username;
	private String phone;
	private String email;
	private String password;
	private String role;
	private String age;
}

package com.doorstep.a.to.z.service.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="admin1")

public class Admin {
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return password;
	}
	public void setPass(String password) {
		this.password = password;
	}
	@Id
	private String email;
	private String password;

	
	
	

}

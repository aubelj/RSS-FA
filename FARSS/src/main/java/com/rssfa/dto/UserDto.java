package com.rssfa.dto;

import java.sql.Date;

public class UserDto {

	private Integer id;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private Date creation_date;

	public UserDto() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}

	public String getLastName() {
		return last_name;
	}
	
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreationDate() {
		return creation_date;
	}

	public void setCreationDate(Date creation_date) {
		this.creation_date = creation_date;
	}
}

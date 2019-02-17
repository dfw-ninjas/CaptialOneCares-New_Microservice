package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "personal_details")
public class PersonalDetails {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="personal_id")
	 private Integer personal_id;
	 
	 @Column(name="first_name")
	 private String first_name;
	 
	 @Column(name="last_name")
	 private String last_name;
	 
	 @Column(name="password")
	 private String password;
	 
	 @Column(name="birth_year")
	 private String birth_year;
	 
	 @Column(name="email_id")
	 private String email_id;

	 @Column(name="is_parent")
	 private String is_parent;
	 
	 @Column(name="is_student")
	 private String is_student;

	public Integer getPersonal_id() {
		return personal_id;
	}

	public void setPersonal_id(Integer personal_id) {
		this.personal_id = personal_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getIs_parent() {
		return is_parent;
	}

	public void setIs_parent(String is_parent) {
		this.is_parent = is_parent;
	}

	public String getIs_student() {
		return is_student;
	}

	public void setIs_student(String is_student) {
		this.is_student = is_student;
	}

	
	 

}

package com.test.amadeus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity (name = "Person")
@Table(name = "person")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idperson")
    private Long idperson;
	
	@NotNull
	@Column(name = "name",nullable = false,updatable = true)
    private String name;
	
	
	@Column(name = "number",nullable = false,updatable = true)
    private Long number;
	
	@Column(name = "phone",nullable = false,updatable = true)
    private Long phone;
	
	@Column(name = "email",nullable = false,updatable = true)
    private String email;
	
	@Column(name = "address",nullable = false,updatable = true)
    private String address;

	
	
	
	public Person() {
		
	}



	public Person(Long idperson, String name, Long number, Long phone, String email, String address) {
		super();
		this.idperson = idperson;
		this.name = name;
		this.number = number;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}



	public Long getIdperson() {
		return idperson;
	}



	public void setIdperson(Long idperson) {
		this.idperson = idperson;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Long getNumber() {
		return number;
	}



	public void setNumber(Long number) {
		this.number = number;
	}



	public Long getPhone() {
		return phone;
	}



	public void setPhone(Long phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}
	

}

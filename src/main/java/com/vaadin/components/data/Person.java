package com.vaadin.components.data;

public class Person {
	private String firstName;
	private String lastName;
	private String email;
	private String Address;
	private Integer Id;

	public Person(String firstName, String lastName, String email, String address,Integer id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		Address = address;
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

}

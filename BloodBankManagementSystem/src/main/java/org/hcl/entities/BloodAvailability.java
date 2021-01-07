package org.hcl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Required;

import com.sun.istack.NotNull;

@Entity
public class BloodAvailability {
	@Id
	private Integer userId;
	private String firstName;
	private String lastName;
	private String bloodGroup;
	private String city;

	public BloodAvailability() {
		// TODO Auto-generated constructor stub
	}

	public BloodAvailability(Integer userId, String firstName, String lastName, String bloodGroup, String city) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bloodGroup = bloodGroup;
		this.city = city;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

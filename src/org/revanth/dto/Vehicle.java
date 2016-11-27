package org.revanth.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue
	private int VehicleId;
	private String VehicleName;

	@ManyToOne
	@NotFound(action=NotFoundAction.IGNORE)
	private UserDetails user;
	
	public String getVehicleName() {
		return VehicleName;
	}
	public void setVehicleName(String vehicleName) {
		VehicleName = vehicleName;
	}
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}

}

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

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue
	private int VehicleId;
	private String VehicleName;

	@ManyToMany(mappedBy="vehicle")
	private Collection<UserDetails> userlist  = new ArrayList<UserDetails>();
	
	public String getVehicleName() {
		return VehicleName;
	}
	public void setVehicleName(String vehicleName) {
		VehicleName = vehicleName;
	}
	public Collection<UserDetails> getUserlist() {
		return userlist;
	}
	public void setUserlist(Collection<UserDetails> userlist) {
		this.userlist = userlist;
	}

}

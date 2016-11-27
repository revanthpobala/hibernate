package org.revanth.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Bike")
public class TwoWheeler extends Vehicle {
	
	private String Steeringhandle;

	public String getSteeringhandle() {
		return Steeringhandle;
	}

	public void setSteeringhandle(String steeringhandle) {
		Steeringhandle = steeringhandle;
	}
}

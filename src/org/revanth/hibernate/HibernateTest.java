package org.revanth.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.revanth.dto.Address;
import org.revanth.dto.FourWheeler;
import org.revanth.dto.TwoWheeler;
import org.revanth.dto.UserDetails;
import org.revanth.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {

		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");
		
		TwoWheeler bike  = new TwoWheeler();
		bike.setSteeringhandle("Bike steering Handle");
		bike.setVehicleName("bike");
		
		FourWheeler car = new FourWheeler();
		car.setVehicleName("Porshe");
		car.setSteeringWheel("Porshe Steering Wheel");
		
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		session.save(car);
		session.save(bike);
		session.save(vehicle);
		session.getTransaction().commit();
		session.close();
	}

}

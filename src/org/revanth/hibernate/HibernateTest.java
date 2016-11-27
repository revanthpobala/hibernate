package org.revanth.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.revanth.dto.Address;
import org.revanth.dto.UserDetails;
import org.revanth.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {

		UserDetails users = new UserDetails();
		users.setUsername("rebu");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");
		
		users.setVehicle(vehicle);
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(users);
		session.save(vehicle);
		session.getTransaction().commit();
		session.close();
	}

}

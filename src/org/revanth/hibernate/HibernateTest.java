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

		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		for (int i = 0; i < 10; i++) {
			UserDetails user = new UserDetails();
			user.setUsername("User"+i);
			session.save(user);
		}



		session.getTransaction().commit();
		session.close();
	}

}

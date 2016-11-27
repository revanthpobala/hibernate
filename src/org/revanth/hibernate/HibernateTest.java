package org.revanth.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.revanth.dto.Address;
import org.revanth.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {

		UserDetails users = new UserDetails();
		users.setUsername("rebu");
//		users.setAddress("7546 w 140 st");
//		Date d = new Date();
//		users.setJoinedData(d);
		
		Address addr  = new Address();
		addr.setCity("Hyderabad");
		addr.setPincode("502103");
		addr.setState("TS");
		addr.setStreet("Mohinpura");
//		
//		users.setHomeAddress(addr);

		//UserDetails user2 = new UserDetails();
		Address addr2  = new Address();
		addr2.setCity("Siddipet");
		addr2.setPincode("502103");
		addr2.setState("TS");
		addr2.setStreet("Khaderpura");
//		user2.setUsername("Lobu");
//		users.setOfficeAddress(addr2);
		
		users.getListOfAddress().add(addr);
		users.getListOfAddress().add(addr2);
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(users);
		//session.save(user2);
		session.getTransaction().commit();
		session.close();
		
//		users = null;
//		session = sessionfactory.openSession();
//		session.beginTransaction();
//		users = (UserDetails) session.get(UserDetails.class, 3);
//		System.out.println(users.getUsername());
//		
	}

}

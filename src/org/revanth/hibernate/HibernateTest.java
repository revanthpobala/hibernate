package org.revanth.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
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

		// Not the table name. You should mention the Object Name after whre
		// clause you need to give the Column name for ex column name = User_ID
		Query query = session.getNamedQuery("UserDetails.byId");
		query.setInteger(0,2);

		List<UserDetails> users = (List<UserDetails>) query.list();
		System.out.println(users.size());

		session.getTransaction().commit();
		session.close();
		
		for(UserDetails u: users){
			System.out.println(u.getUsername());
		}

	}

}

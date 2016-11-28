package org.revanth.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
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

		
		Criteria criteria = session.createCriteria(UserDetails.class);
		criteria.add(Restrictions.eq("username", "User9"));
		List<UserDetails> users = (List<UserDetails>) criteria.list();
		
		System.out.println(users.size());

		session.getTransaction().commit();
		session.close();
		
		for(UserDetails u: users){
			System.out.println(u.getUsername());
		}

	}

}

package com.revature.HibernateChallenge.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.HibernateChallenge.models.User;
import com.revature.HibernateChallenge.util.HibernateUtil;

public class UserDAO {

	public List<User> getUsers() {
		Session session = HibernateUtil.getSession();
		return session.createQuery("from User").list();
	}

	public User getUserByName(String aName) {
		User found = null;
		List<User> users = new ArrayList<>();
		Session session = HibernateUtil.getSession();
		users = session.createQuery("from User where name = :nameVar").setString("nameVar", aName).list();

		if (!users.isEmpty()) {
			found = users.get(0);
		}

		return found;
	}

	public int saveUser(User u) {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		int result = (int) session.save(u);
		tx.commit();
		return result;
	}
}

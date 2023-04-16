package com.dao;

import javax.persistence.EntityManager;

import com.model.Passport;
import com.model.User;
import com.util.EmUtils;

public class UserPassportDAO {
	public static void main(String[] args) {
		EntityManager em = EmUtils.getEntityManager();
		Passport passport = new Passport();
		User user = new User();

		passport.setPassportNumber("ASDF1234");
		passport.setUser(user);

		user.setAadhar("34235984937483");
		user.setName("Hoshiyar Singh");

		user.setPassport(passport);

		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		System.out.println("Sucessfully Added");

	}
}

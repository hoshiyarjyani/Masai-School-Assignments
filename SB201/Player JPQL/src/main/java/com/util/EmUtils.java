package com.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtils {
	private static EntityManagerFactory emf = null;
	static {
		emf = Persistence.createEntityManagerFactory("Player");
	}

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

}
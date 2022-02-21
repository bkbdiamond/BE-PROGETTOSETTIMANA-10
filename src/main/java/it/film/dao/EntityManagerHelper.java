package it.film.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerHelper {
	

	public static EntityManager getEntityManager() {
	
		return null;
	}
	
	public static EntityManager EntityManager () {
		return getEmf().createEntityManager();
	}

	public static EntityManagerFactory getEmf() {
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory("Film");
		}
		return emf;
	}
}

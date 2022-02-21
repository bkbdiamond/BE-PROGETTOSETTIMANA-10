package it.film.dao;

import javax.persistence.EntityManager;

import it.film.entity.Film;
import it.film.entity.Register;

public class FilmDaoImp implements FilmDao {
	private EntityManager em = null;
	
	public EntityManager getEm() {
		if(em == null) {
			em = EntityManagerHelper.getEntityManager();
		}
		return em;
	}
	
	
	public void salva(Film f) {
		getEm().getTransaction().begin();
		getEm().persist(f);
		getEm().getTransaction().commit();
		
		
	}

	public void aggiorna(Film f) throws Exception{
		Film f1 = getEm().find(Film.class, f1.getRegister());
		if(f1==null) {
			throw new Exception("film non trovato");
		}
		getEm().getTransaction().begin();
		getEm().merge(f1);
		getEm().getTransaction().commit();
	}
	
		
	public void cancella(int id) {
			try {
				Register r = void trova(int id) {
				getEm().getTransaction().begin();
				Register r;
				getEm().remove(r);
				
	}

	public Film trova(Film f) {
		return getEm().find(Film.class, titolo);
		
	
	}


	public void cancella(Film f) {
		getEm().getTransaction().begin();
		getEm().remove(f);
		getEm().getTransaction().commit();
	}
		


	public Film trova(Register r) {
		return getEm().find(Register.class, id);
		
	
	}


	public void cancella(String register) {
		getEm().getTransaction().begin();
		getEm().remove(r);
		getEm().getTransaction().commit();
	}
	
		
	
		
		
	}


	
	


	
		
	
	
	



package it.film.dao;

import antlr.collections.List;
import it.film.entity.Film;
import it.film.entity.Register;

public interface FilmDao {
	
	public void salva(Film f);
	public void aggiorna(Film f) throws Exception;
	public void cancella(Film f);
	public Film trova(Register r);
	public void cancella(String string);


}
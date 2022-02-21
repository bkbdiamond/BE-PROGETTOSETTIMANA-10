package it.film.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table
public class Film {
	private String titolo;
	private String anno;
	private String register;
	private String tipo;
	private Double incasso;
	
	@Column
	public String getTitolo() { return titolo; }
		
	
	@Column
	public String getAnno() { return anno;}
		
	
	
	@Column
	public String getRegister() { return register; }
		
	
	@Column
	public String getTipo() { 	return tipo; }
	
	
	@Column
	public Double getIncasso() { return incasso;}
		
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	
	
	}
	public void setAnno(String anno) {
		this.anno = anno;
	}
	
	public void setRegister(String register) {
		this.register = register;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setIncasso(Double incasso) {
		this.incasso = incasso;
	}
	

}

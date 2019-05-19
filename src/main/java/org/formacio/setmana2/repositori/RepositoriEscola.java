package org.formacio.setmana2.repositori;

import org.formacio.setmana2.domini.Curs;
import org.formacio.setmana2.domini.Matricula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Modifica aquesta classe per tal que sigui un component Spring que realitza les 
 * operacions de persistencia tal com indiquen les firmes dels metodes
 */
@Component
public class RepositoriEscola {

	@PersistenceContext
	EntityManager entityManager = null;

	public Curs carregaCurs(String nom) {
		return entityManager.find(Curs.class, nom);
	}
	
	
	public Matricula apunta (String alumne, String curs) throws EdatIncorrecteException {
	    return null;	
	}
	
	
}

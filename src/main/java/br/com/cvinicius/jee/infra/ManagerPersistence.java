package br.com.cvinicius.jee.infra;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class ManagerPersistence{
	
	@PersistenceContext(unitName="appJeeAngular")
	private EntityManager entityManager;

	public EntityManager getEntityManager(){
		return entityManager;
	}
}
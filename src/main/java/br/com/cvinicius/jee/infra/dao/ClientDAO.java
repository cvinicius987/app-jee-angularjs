package br.com.cvinicius.jee.infra.dao;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.cvinicius.jee.domain.Client;
import br.com.cvinicius.jee.domain.ClientRepository;
import br.com.cvinicius.jee.infra.ManagerPersistence;

@ApplicationScoped
public class ClientDAO implements ClientRepository{

	@Inject
	private ManagerPersistence manager;
	
	@Override
	public List<Client> findAll() {
		EntityManager entity = this.manager.getEntityManager();
		
		TypedQuery<Client> query = entity.createQuery(" FROM Client ", Client.class);
		
		return query.getResultList();
	}
}
package br.com.cvinicius.jee.domain;

import java.util.List;

public interface ClientRepository{
	
	List<Client> findAll();
}
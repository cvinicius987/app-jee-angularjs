package br.com.cvinicius.jee.api;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.cvinicius.jee.domain.Client;
import br.com.cvinicius.jee.domain.ClientRepository;

@Path("/clients")
public class ClientAPI{
	
	@Inject
	private ClientRepository clientRepository;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Client> list(){
    	return this.clientRepository.findAll();
    } 
}
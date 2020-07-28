package com.lambdasys.unidadefederativa.api;

import java.io.Serializable;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface UnidadeFederativaResource extends Serializable {

	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	@Path("/unidadesfederativas")
	public List<UnidadeFederativa> findAll();

	@GET
	@Produces(value= MediaType.APPLICATION_JSON)
	@Path("/unidadesfederativas/{id}")
	public UnidadeFederativa findById( @PathParam("id") Long id );
	
}

package com.lambdasys.microservices.municipio.api;

import java.io.Serializable;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface MunicipioResource extends Serializable {

	@GET
	@Path("/municipios/unidadefederativa/{ufId}")
	@Produces(value = MediaType.APPLICATION_JSON )
	List<Municipio> findByUnidadeFederativaId( @PathParam("ufId") Long ufId );
	
	@GET
	@Path("/municipios/{id}")
	@Produces(value = MediaType.APPLICATION_JSON )
	Municipio findById( @PathParam("id") Long id );
	
	
	
}	

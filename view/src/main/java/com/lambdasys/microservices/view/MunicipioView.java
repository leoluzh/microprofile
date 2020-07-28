package com.lambdasys.microservices.view;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.lambdasys.microservices.municipio.api.Municipio;
import com.lambdasys.microservices.municipio.api.MunicipioResource;
import com.lambdasys.unidadefederativa.api.UnidadeFederativa;
import com.lambdasys.unidadefederativa.api.UnidadeFederativaResource;

import lombok.Getter;
import lombok.Setter;

@Named
@RequestScoped
@SuppressWarnings("serial")
public class MunicipioView implements Serializable {

	@Inject
	@RestClient
	protected UnidadeFederativaResource unidadeFederativaResource;
	
	@Inject
	@RestClient
	protected MunicipioResource municipioResource;
	
	@Getter @Setter
	protected UnidadeFederativa unidadeFederativa;

	@Getter @Setter
	protected Municipio municipio;
	
	
	
	public List<UnidadeFederativa> getUnidadesFederativas(){
		return this.unidadeFederativaResource.findAll();
	}
	
	public List<Municipio> getMunicipios(){
		return Optional.ofNullable( unidadeFederativa )
				.map( uf ->  {
					return this.municipioResource.findByUnidadeFederativaId( uf.getId() );
				})
				.orElseGet( () -> Collections.emptyList() );
	}
	
}

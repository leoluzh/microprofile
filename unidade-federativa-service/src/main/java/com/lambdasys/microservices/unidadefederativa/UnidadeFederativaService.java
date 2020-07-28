package com.lambdasys.microservices.unidadefederativa;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Path;

import com.lambdasys.unidadefederativa.api.UnidadeFederativa;
import com.lambdasys.unidadefederativa.api.UnidadeFederativaResource;

@Path("/unidadesfederativas")
@ApplicationScoped
@SuppressWarnings("serial")
public class UnidadeFederativaService implements UnidadeFederativaResource {

	@Override
	public List<UnidadeFederativa> findAll() {
		return null;
	}

	@Override
	public UnidadeFederativa findById(Long id) {
		return null;
	}

}

package com.lambdasys.microservices.municipio;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Path;

import com.lambdasys.microservices.municipio.api.Municipio;
import com.lambdasys.microservices.municipio.api.MunicipioResource;

@Path("/municipios")
@ApplicationScoped
@SuppressWarnings("serial")
public class MunicipioService implements MunicipioResource  {

	@Override
	public List<Municipio> findByUnidadeFederativaId(Long ufId) {
		return null;
	}

	@Override
	public Municipio findById(Long id) {
		return null;
	}

}

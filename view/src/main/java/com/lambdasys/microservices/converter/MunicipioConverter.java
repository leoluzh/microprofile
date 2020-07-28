package com.lambdasys.microservices.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.lambdasys.microservices.municipio.api.Municipio;
import com.lambdasys.microservices.municipio.api.MunicipioResource;

@FacesConverter("localidadeConverter")
public class MunicipioConverter implements Converter<Municipio> {

	@Inject
	@RestClient
	protected MunicipioResource resource;
	
	
	@Override
	public Municipio getAsObject(FacesContext context, UIComponent component, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Municipio value) {
		// TODO Auto-generated method stub
		return null;
	}

}

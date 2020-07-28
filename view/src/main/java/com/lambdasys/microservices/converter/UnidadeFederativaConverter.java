package com.lambdasys.microservices.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.lambdasys.unidadefederativa.api.UnidadeFederativa;
import com.lambdasys.unidadefederativa.api.UnidadeFederativaResource;

@FacesConverter("unidadeFederativaConverter")
public class UnidadeFederativaConverter implements Converter<UnidadeFederativa> {

	@Inject
	@RestClient
	private UnidadeFederativaResource resource;
	
	@Override
	public UnidadeFederativa getAsObject(FacesContext context, UIComponent component, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, UnidadeFederativa value) {
		// TODO Auto-generated method stub
		return null;
	}

}

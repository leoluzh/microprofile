package com.lambdasys.microservices.municipio.api;

import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.IsNot;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

@DisplayName("Teste: Municipio")
@ExtendWith(MockitoExtension.class)
class MunicipioTest {

	//public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	@Mock
	MunicipioResource MunicipioResource;
	
	
	@Test
	@DisplayName("Test - Builder is not null")
	public void testBuilerIsNotNull(){
		Municipio Municipio = Municipio.builder().build();
		assertThat( Municipio , is(not(equalTo(null))) );
	}

	@Test
	@DisplayName("Test - Id is not null")
	public void testBuilerIsIdNotNull(){
		Municipio Municipio = Municipio.builder().id(1L).build();
		assertThat( Municipio.getId() , is(not(equalTo(null))) );
	}

	@Test
	@DisplayName("Test - Nome is equals Belo Horizonte")
	public void testBuilerIsNotBeloHorizonte(){
		Municipio Municipio = Municipio.builder().nome("Belo Horizonte").build();
		assertThat( Municipio.getNome() , is(equalTo("Belo Horizonte")) );
	}
	
	
}

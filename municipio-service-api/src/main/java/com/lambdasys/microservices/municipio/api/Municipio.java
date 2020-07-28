package com.lambdasys.microservices.municipio.api;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter 
@Setter
@Builder
@ToString(of = {"id","ufId","nome"})
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
@NoArgsConstructor

@SuppressWarnings("serial")
public class Municipio implements Serializable {

	private Long id;
	private Long ufId;
	private String nome;
	
}
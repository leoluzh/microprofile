package com.lambdasys.unidadefederativa.api;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id","sigla","nome"})
@ToString(of = {"id","sigla","nome"})

@SuppressWarnings("serial")
public class UnidadeFederativa implements Serializable {

	private Long id;
	private String sigla;
	private String nome;
	
}

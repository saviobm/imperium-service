package br.com.imperium.modelo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class ImperiumEntidade implements Serializable {
	
	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = -2152443572434373454L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

}
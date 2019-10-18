package com.cotemig.atividadeRevisao.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Time {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String nome;
	
	@OneToMany(mappedBy="time")
    private Set<Atleta> atletas;
	
	public Set<Atleta> getAtletas() {
		return atletas;
	}
	public void setAtletas(Set<Atleta> atletas) {
		this.atletas = atletas;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}

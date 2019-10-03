package com.cotemig.atividadeRevisao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.atividadeRevisao.model.Atleta;
import com.cotemig.atividadeRevisao.repository.AtletaRepository;


	@Service("atletaService")
	public class AtletaServiceImpl implements AtletaService {
	 
	 @Autowired
	 AtletaRepository atletaRepository; 

	 @Override
	 public Optional<Atleta> getAtletaById(Integer id) {
	 return atletaRepository.findById(id);
	 }

	 @Override
	 public List<Atleta> getAllAtletas() {
	 return atletaRepository.findAll();
	 }

	 @Override
	 public void deleteAllAtleta() {
	 atletaRepository.deleteAll();
	 }

	 @Override
	 public void deleteAtletaById(Integer id) {
		 atletaRepository.deleteById(id);
	 }

	 @Override
	 public void updateAtletaById(Integer id, Atleta atleta) {
	 
	 Optional<Atleta> getAtleta = getAtletaById(id);
	 getAtleta.get().setNome(atleta.getNome());
	 
	 
	 atletaRepository.save(atleta);
	 }
	 
	 @Override
	 public void updateAtleta(Atleta atleta) {
		 atletaRepository.save(atleta);
	 }

	 @Override
	 public void insertAtleta(Atleta atleta) {
	 atletaRepository.save(atleta);
	 }
	}



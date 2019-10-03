package com.cotemig.atividadeRevisao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.atividadeRevisao.model.Atleta;

@Repository("atletaRepository")
public interface AtletaRepository extends JpaRepository<Atleta, Integer> {

}

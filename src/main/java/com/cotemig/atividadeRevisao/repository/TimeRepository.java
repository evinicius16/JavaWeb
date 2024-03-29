package com.cotemig.atividadeRevisao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.atividadeRevisao.model.Time;


@Repository("timeRepository")
public interface TimeRepository extends JpaRepository<Time, Integer> {

}


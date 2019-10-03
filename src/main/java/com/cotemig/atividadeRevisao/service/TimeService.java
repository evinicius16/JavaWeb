package com.cotemig.atividadeRevisao.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.atividadeRevisao.model.Time;

public interface TimeService {
	
	 Optional<Time> getTimeById(Integer id);
	 List<Time> getAllTime();
	 void deleteAllTime();
	 void deleteTimeById(Integer id);
	 void updateTimeById(Integer id, Time time);
	 void updateTime(Time time);
	 void insertTime(Time time);
	 
	}
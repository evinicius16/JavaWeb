package com.cotemig.atividadeRevisao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.atividadeRevisao.model.Time;
import com.cotemig.atividadeRevisao.repository.TimeRepository;

@Service("atletaService")
public class TimeServiceImpl implements TimeService {
 
 @Autowired
 TimeRepository timeRepository; 

 @Override
 public Optional<Time> getTimeById(Integer id) {
 return timeRepository.findById(id);
 }

 @Override
 public List<Time> getAllTime() {
 return timeRepository.findAll();
 }

 @Override
 public void deleteAllTime() {
 timeRepository.deleteAll();
 }

 @Override
 public void deleteTimeById(Integer id) {
	 timeRepository.deleteById(id);
 }

 @Override
 public void updateTimeById(Integer id, Time time) {
 
 Optional<Time> getTime = getTimeById(id);
 getTime.get().setNome(time.getNome());
 
 
 timeRepository.save(time);
 }
 
 @Override
 public void updateTime(Time time) {
	 timeRepository.save(time);
 }

 @Override
 public void insertTime(Time time) {
 timeRepository.save(time);
 }
}
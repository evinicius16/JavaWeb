package com.cotemig.atividadeRevisao.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cotemig.atividadeRevisao.model.Atleta;
import com.cotemig.atividadeRevisao.service.AtletaService;

@Controller
public class AtividadeRevisaoController {

 @Autowired
 private AtletaService atletaService;
 
 @RequestMapping(value = "/insert", method = RequestMethod.GET)
 public ModelAndView insert() {
        return new ModelAndView("insert", "atleta", new Atleta());
 }
 
 @RequestMapping(value = "/insert", method = RequestMethod.POST)
 public String submitInsert(@Valid @ModelAttribute("atleta")Atleta atleta, 
      BindingResult result, ModelMap model) {
        
 if (result.hasErrors()) {
            return "error";
        }
        
 atletaService.insertAtleta(atleta);
        
        return "redirect:";
 }
 
 @RequestMapping(value = "/delete", method = RequestMethod.GET)
 public ModelAndView delete(Integer id) {
 
 return new ModelAndView("delete", "atleta", atletaService.getAtletaById(id).get());
 }
 
 @RequestMapping(value = "/delete", method = RequestMethod.POST)
 public String submitDelete(@Valid @ModelAttribute("atleta")Atleta atleta,
      BindingResult result, ModelMap model) {
        
 if (result.hasErrors()) {
            return "error";
        }
 
 atletaService.deleteAtletaById(atleta.getId());
        
        return "redirect:";
 }
 
 @RequestMapping(value = "/update", method = RequestMethod.GET)
 public ModelAndView update(Integer id) {
 
        return new ModelAndView("update", "atleta", atletaService.getAtletaById(id).get());
 }
 
 @RequestMapping(value = "/update", method = RequestMethod.POST)
 public String submitUpdate(@Valid @ModelAttribute("aluno")Atleta atleta,
      BindingResult result, ModelMap model) {
        
 if (result.hasErrors()) {
            return "error";
        }
 
 atletaService.updateAtleta(atleta);
        
        return "redirect:";
 }
 
 @RequestMapping(value = "/read", method = RequestMethod.GET)
 public ModelAndView read() {
        
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("alunos", atletaService.getAllAtletas());
        return mav;
 }
 
 @RequestMapping(value = "/", method = RequestMethod.GET)
 public ModelAndView index() {
        
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("alunos", atletaService.getAllAtletas());
        return mav;
 }
}
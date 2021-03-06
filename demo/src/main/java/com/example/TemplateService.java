package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemplateService {
	
	@Autowired
	private TemplateRepo templateRepo;
	
	public List<template> listAll(){
		return templateRepo.findAll();
	}
	
	public void save(template t) {
		templateRepo.save(t);
	}
	
	public template get(Integer id) {
		return templateRepo.findById(id).get();
	}

	public void delete(Integer id) {
		templateRepo.deleteById(id);
	}
}

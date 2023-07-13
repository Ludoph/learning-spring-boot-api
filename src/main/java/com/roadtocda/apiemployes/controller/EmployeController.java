package com.roadtocda.apiemployes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roadtocda.apiemployes.model.Employe;
import com.roadtocda.apiemployes.service.EmployeService;

@RestController
public class EmployeController {
	
	@Autowired
	private EmployeService employeService;
	
	@GetMapping("/employes")
	public Iterable<Employe> getEmployes(){
		return employeService.getEmployes();
	}
}

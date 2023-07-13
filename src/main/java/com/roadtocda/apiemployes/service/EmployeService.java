package com.roadtocda.apiemployes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roadtocda.apiemployes.model.Employe;
import com.roadtocda.apiemployes.repository.EmployeRepository;

@Service
public class EmployeService {
	
	@Autowired
	private EmployeRepository emplRepository;
	
	public Optional<Employe> getEmploye(final Long id){
		return emplRepository.findById(id);
	}
	
	public Iterable<Employe> getEmployes(){
		return emplRepository.findAll();
	}
	
	public void deleteEmploye(final Long id) {
		emplRepository.deleteById(id);
	}
	public Employe saveEmploye(Employe employe) {
		Employe savedEmployee = emplRepository.save(employe);
		return savedEmployee;
	}
	
	
	
}

package com.roadtocda.apiemployes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roadtocda.apiemployes.model.Employe;

@Repository
public interface EmployeRepository extends CrudRepository<Employe, Long> {

}

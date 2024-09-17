package com.amaze.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amaze.model.Diagnosis;

@Repository
public interface DiagnosisRepo  extends JpaRepository<Diagnosis, Integer>{
	

}

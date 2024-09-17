package com.amaze.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amaze.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer>{

}

package com.amaze.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amaze.dto.TestAddDto;
import com.amaze.exception.InvalidIdException;
import com.amaze.model.Diagnosis;
import com.amaze.model.Test;
import com.amaze.repo.DiagnosisRepo;
import com.amaze.repo.TestRepo;

@Service
public class TestService {
	
	@Autowired
	private TestRepo testrepo;
	
	@Autowired
	private DiagnosisRepo diagnosisrepo;

	public Test addTest(int diagnosid, TestAddDto testadddto) throws InvalidIdException {
		
		//fetching diagnosis basis diagnosisId
		System.out.println("di"+diagnosid);
		Optional<Diagnosis> optionaldiagnosis = diagnosisrepo.findById(diagnosid);
		if(optionaldiagnosis.isEmpty()) {
			throw new InvalidIdException("Invalid DiagnosisID");
		}
		
		Diagnosis diagnosis = optionaldiagnosis.get();
		//saving diagnosis to test
		Test test =new Test();
		
		test.setDiagnosis(diagnosis);
		test.setTestName(testadddto.getTestName());
		test.setDateTestGivenByDoctor(LocalDate.now());
		test.setTestStatus("pending");
		
		return testrepo.save(test);
		
		
	}
	
	

}

package com.amaze.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Test {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int Test_id;
		
		@ManyToOne
	    private Diagnosis diagnosis; // Link to Diagnosis
		
	    private String testName;
	    
	    
	    private String testStatus; // Pending/Completed == test_result
	    
	    private String testDetails; // Detailed description of the test == test_result
	    
	    private String testResult; // Positive/Negative/Normal == test_result
	    
	    //private int executiveId; // Person executing the test
	    
	    private String labName; // Lab responsible for the test == test_result
	    
	    private LocalDate dateTestGivenByDoctor; // Date test was prescribed by the doctor
	    
	    private LocalDate dateTestConducted; // Date the test was conducted == test_result
	    
	    private LocalDate dateTestResult; // Date the result was available == test_result

		public int getTest_id() {
			return Test_id;
		}

		public void setTest_id(int test_id) {
			Test_id = test_id;
		}

		public Diagnosis getDiagnosis() {
			return diagnosis;
		}

		public void setDiagnosis(Diagnosis diagnosis) {
			this.diagnosis = diagnosis;
		}

		public String getTestName() {
			return testName;
		}

		public void setTestName(String testName) {
			this.testName = testName;
		}

		public String getTestStatus() {
			return testStatus;
		}

		public void setTestStatus(String testStatus) {
			this.testStatus = testStatus;
		}

		public String getTestDetails() {
			return testDetails;
		}

		public void setTestDetails(String testDetails) {
			this.testDetails = testDetails;
		}

		public String getTestResult() {
			return testResult;
		}

		public void setTestResult(String testResult) {
			this.testResult = testResult;
		}

		public String getLabName() {
			return labName;
		}

		public void setLabName(String labName) {
			this.labName = labName;
		}

		public LocalDate getDateTestGivenByDoctor() {
			return dateTestGivenByDoctor;
		}

		public void setDateTestGivenByDoctor(LocalDate dateTestGivenByDoctor) {
			this.dateTestGivenByDoctor = dateTestGivenByDoctor;
		}

		public LocalDate getDateTestConducted() {
			return dateTestConducted;
		}

		public void setDateTestConducted(LocalDate dateTestConducted) {
			this.dateTestConducted = dateTestConducted;
		}

		public LocalDate getDateTestResult() {
			return dateTestResult;
		}

		public void setDateTestResult(LocalDate dateTestResult) {
			this.dateTestResult = dateTestResult;
		}

}

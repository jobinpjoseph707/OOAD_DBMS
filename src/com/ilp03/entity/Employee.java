package com.ilp03.entity;

public class Employee {
    private int employeeID;
    private String firstName;
    private String lastName;
    private String department;
    private String position;
    private String contactInformation;
    
    
    private TrainingEmployee trainingEmployee;
    private Incident incident;
    private Training training;
    
    

    
	public Training getTraining() {
		return training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}

	public TrainingEmployee getTrainingEmployee() {
		return trainingEmployee;
	}

	public void setTrainingEmployee(TrainingEmployee trainingEmployee) {
		this.trainingEmployee = trainingEmployee;
	}

	public Incident getIncident() {
		return incident;
	}

	public void setIncident(Incident incident) {
		this.incident = incident;
	}

	public Employee(String firstName) {
		this.firstName = firstName;
	}
	
	public Employee() {}
    
	public Employee(int employeeID, String firstName, String lastName, String department, String position,
			String contactInformation) {
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.position = position;
		this.contactInformation = contactInformation;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getContactInformation() {
		return contactInformation;
	}
	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

    // Constructor, getters, setters
}

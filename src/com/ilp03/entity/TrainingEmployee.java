package com.ilp03.entity;

public class TrainingEmployee {
    private int trainingEmployeeID;
    private int employeeID;
    private int trainingID;
    private String status;
	public int getTrainingEmployeeID() {
		return trainingEmployeeID;
	}
	public void setTrainingEmployeeID(int trainingEmployeeID) {
		this.trainingEmployeeID = trainingEmployeeID;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public int getTrainingID() {
		return trainingID;
	}
	public void setTrainingID(int trainingID) {
		this.trainingID = trainingID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public TrainingEmployee(int trainingEmployeeID, int employeeID, int trainingID, String status) {
		this.trainingEmployeeID = trainingEmployeeID;
		this.employeeID = employeeID;
		this.trainingID = trainingID;
		this.status = status;
	}
	public TrainingEmployee(String status) {
		// TODO Auto-generated constructor stub
	}
	


}

package com.ilp03.entity;

import java.sql.Date;

public class Incident {
    private int incidentID;
    private int employeeID;
    private Date incidentDate;
    private String type;
    private String description;
    private int trainingID;
    
	public int getIncidentID() {
		return incidentID;
	}
	public void setIncidentID(int incidentID) {
		this.incidentID = incidentID;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public Date getIncidentDate() {
		return incidentDate;
	}
	public void setIncidentDate(Date incidentDate) {
		this.incidentDate = incidentDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getTrainingID() {
		return trainingID;
	}
	public void setTrainingID(int trainingID) {
		this.trainingID = trainingID;
	}
	public Incident(int incidentID, int employeeID, Date incidentDate, String type, String description,
			int trainingID) {
		this.incidentID = incidentID;
		this.employeeID = employeeID;
		this.incidentDate = incidentDate;
		this.type = type;
		this.description = description;
		this.trainingID = trainingID;
	}
	public Incident(String firstName, String status, String type2) {
		// TODO Auto-generated constructor stub
	}
	public Incident(String type) {
		// TODO Auto-generated constructor stub
	}
	public Object getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	

}

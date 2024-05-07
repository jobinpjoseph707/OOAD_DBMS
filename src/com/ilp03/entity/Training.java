package com.ilp03.entity;

import java.sql.Date;

public class Training {
    private int trainingID;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
    private int trainer;
    private int createdBy;
	public int getTrainingID() {
		return trainingID;
	}
	public void setTrainingID(int trainingID) {
		this.trainingID = trainingID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getTrainer() {
		return trainer;
	}
	public void setTrainer(int trainer) {
		this.trainer = trainer;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Training(int trainingID, String title, String description, Date startDate, Date endDate, int trainer,
			int createdBy) {
		this.trainingID = trainingID;
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainer = trainer;
		this.createdBy = createdBy;
	}
	public Training(String title) {
		// TODO Auto-generated constructor stub
	}

    
    

}

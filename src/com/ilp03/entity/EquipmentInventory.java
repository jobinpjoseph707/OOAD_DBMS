package com.ilp03.entity;

import java.sql.Date;

public class EquipmentInventory {
    private int equipmentID;
    private String equipmentName;
    private String description;
    private int createdBy;
    private Date lastMaintenanceDate;
	public int getEquipmentID() {
		return equipmentID;
	}
	public void setEquipmentID(int equipmentID) {
		this.equipmentID = equipmentID;
	}
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getLastMaintenanceDate() {
		return lastMaintenanceDate;
	}
	public void setLastMaintenanceDate(Date lastMaintenanceDate) {
		this.lastMaintenanceDate = lastMaintenanceDate;
	}
	public EquipmentInventory(int equipmentID, String equipmentName, String description, int createdBy,
			Date lastMaintenanceDate) {
		this.equipmentID = equipmentID;
		this.equipmentName = equipmentName;
		this.description = description;
		this.createdBy = createdBy;
		this.lastMaintenanceDate = lastMaintenanceDate;
	}
    

}

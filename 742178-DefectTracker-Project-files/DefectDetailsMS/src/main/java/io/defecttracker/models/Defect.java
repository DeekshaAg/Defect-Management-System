package io.defecttracker.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Defect {
	@Id
	private int defectid;
	private String category;
	private String chgstatus;
	private String description;
	private int priority;
	private String status;
	private String username;
	
	public Defect() {}

	public Defect(int defectid, String category, String chgstatus, String description, int priority, String status, String username) {
		super();
		this.defectid = defectid;
		this.category = category;
		this.chgstatus = chgstatus;
		this.description = description;
		this.priority = priority;
		this.status = status;
		this.username=username;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getDefectid() {
		return defectid;
	}

	public void setDefectid(int defectid) {
		this.defectid = defectid;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getChgstatus() {
		return chgstatus;
	}

	public void setChgstatus(String chgstatus) {
		this.chgstatus = chgstatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}

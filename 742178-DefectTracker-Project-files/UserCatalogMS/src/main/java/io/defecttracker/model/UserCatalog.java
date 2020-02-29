package io.defecttracker.model;

import java.util.List;

public class UserCatalog {
	
	private User user;
	private DefectList defectList;
	
	public UserCatalog() {}
	public UserCatalog(User user, DefectList defects) {
		super();
		this.user = user;
		this.defectList = defects;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public DefectList getDefectList() {
		return defectList;
	}
	public void setDefectList(DefectList defectList) {
		this.defectList = defectList;
	}
	
	
	
	

}

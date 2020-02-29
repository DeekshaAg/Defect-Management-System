package io.defecttracker.models;

import java.util.List;

public class DefectList {
	
	private List<Defect> defects;
	
	public DefectList() {}

	public DefectList(List<Defect> defects) {
		super();
		this.defects = defects;
	}

	public List<Defect> getDefects() {
		return defects;
	}

	public void setDefects(List<Defect> defects) {
		this.defects = defects;
	}

}

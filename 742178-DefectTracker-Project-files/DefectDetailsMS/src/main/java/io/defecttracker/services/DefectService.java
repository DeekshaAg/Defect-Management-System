package io.defecttracker.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.defecttracker.repositories.DefectRepository;
import io.defecttracker.models.*;

@Service
public class DefectService {
	
	@Autowired
	private DefectRepository defectRepository;
	
	public List<Defect> getAllDefects(){
		
		List<Defect> defects = new ArrayList<>();
		
		defectRepository.findAll().forEach(defects::add);
		return defects;
	}
	
	public List<Defect> getAllDefectsForUser(String username){
		
		List<Defect> defects = new ArrayList<>();
		
		defectRepository.findByUsername(username).forEach(defects::add);
		return defects;
	}
	
	public void addDefect(Defect defect) {
	
		defectRepository.save(defect);
	}
	
	public void updateDefect(Defect defect) {
		
		defectRepository.save(defect);
	}
	
	public Defect getByDefectId(int defectId) {
		return defectRepository.findById(defectId).get();
	}

}

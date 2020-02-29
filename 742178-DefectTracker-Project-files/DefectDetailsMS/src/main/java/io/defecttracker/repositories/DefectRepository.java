package io.defecttracker.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.defecttracker.models.Defect;

public interface DefectRepository extends CrudRepository<Defect, Integer>{
	
	public List<Defect> findByUsername(String username);

}

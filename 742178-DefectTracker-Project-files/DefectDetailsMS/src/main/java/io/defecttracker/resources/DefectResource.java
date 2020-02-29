package io.defecttracker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.defecttracker.models.*;
import io.defecttracker.services.DefectService;

@RestController
public class DefectResource {
	
	@Autowired
	private DefectService defectService;
	
	@RequestMapping("/defects")
	public List<Defect> getAllDefects() {
		return defectService.getAllDefects();
	}
	
	@RequestMapping("/defects/{username}")
	public DefectList getAllDefectsForUser(@PathVariable String username){
		List<Defect> defects = defectService.getAllDefectsForUser(username);
		DefectList dlist= new DefectList();
		dlist.setDefects(defects);
		return dlist;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/defects/{username}")
	public void addDefect(@RequestBody Defect defect, @PathVariable String username) {
		defect.setUsername(username);
		defect.setStatus("Open");
		defect.setChgstatus("Open");
		defectService.addDefect(defect);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/defects/{username}/{defectid}")
	public void updateDefect(@RequestBody Defect defect,@PathVariable("username") String username, @PathVariable("defectid") int defectid) {
		defect.setUsername(username);
		defect.setDefectid(defectid);
		defectService.updateDefect(defect);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/defects/{defectId}")
	public void closeDefect(@PathVariable int defectId) {
		Defect defect = defectService.getByDefectId(defectId);
		defect.setStatus("Closed");
		defectService.updateDefect(defect);
	}
}

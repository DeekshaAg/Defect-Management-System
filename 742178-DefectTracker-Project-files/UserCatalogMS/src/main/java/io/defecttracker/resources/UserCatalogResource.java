package io.defecttracker.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.defecttracker.model.DefectList;
import io.defecttracker.model.User;
import io.defecttracker.model.UserCatalog;

@RestController
@RequestMapping("/catalog")

public class UserCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{username}")
	public UserCatalog getUserCatalog(@PathVariable String username) {
		UserCatalog userCatalog = new UserCatalog();
		// REST call to get the user details
		User user = restTemplate.getForObject("http://UserInformationMS/catalog/"+username, User.class);
		userCatalog.setUser(user);
		
		//REST call to get defects list for a user
		
		DefectList defectList = restTemplate.getForObject("http://DefectDetailsMS/defects/"+username, DefectList.class);
		userCatalog.setDefectList(defectList);
		return userCatalog;
	}

}

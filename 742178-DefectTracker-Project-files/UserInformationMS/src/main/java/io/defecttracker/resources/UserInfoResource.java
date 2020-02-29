package io.defecttracker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.defecttracker.services.UserInfoService;
import io.defecttracker.models.*;

@RestController

public class UserInfoResource {
	@Autowired
	private UserInfoService userInfoService;
	
	
	public String testMethod() {
		return "Done";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/login")
	public String getUser(@RequestBody User user) {
		String name= user.getUsername();
		User userObj=userInfoService.getUser(name);
		if(userObj==null)
			return "invalid";
		return userObj.getRole();
	}
	
	@RequestMapping("/catalog/{username}")
	public User getUserDetails(@PathVariable String username) {
		System.out.println("Requested");
		User user = new User();
		user = userInfoService.getUser(username);
		if(user==null){
			user.setUsername(username +" does not exist");
			user.setPassword("N/A");
			user.setUserid(0);
			user.setRole("invalid");
		}
		return user;
	}
}

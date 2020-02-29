package io.defecttracker.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.defecttracker.models.User;
import io.defecttracker.repositories.UserInfoRepository;


@Service
public class UserInfoService {

	@Autowired
	private UserInfoRepository userInfoRepository;
	
	public User getUser(String name) {
		return userInfoRepository.findByUsername(name);
	}
	
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<>();
		userInfoRepository.findAll().forEach(users::add);
		return users;
		}
}

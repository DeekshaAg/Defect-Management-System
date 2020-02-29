package io.defecttracker.repositories;

import org.springframework.data.repository.CrudRepository;

import io.defecttracker.models.User;

public interface UserInfoRepository extends CrudRepository<User, Integer> {
	
	public User findByUsername(String username) ;
}

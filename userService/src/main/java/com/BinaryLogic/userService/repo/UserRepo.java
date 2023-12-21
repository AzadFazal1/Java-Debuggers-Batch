package com.BinaryLogic.userService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BinaryLogic.userService.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	

}

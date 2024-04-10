package com.cpk.UserData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cpk.UserData.model.User;



public interface UserRepository extends JpaRepository<User, Long>{

	void deleteByUid(Long uid);

}

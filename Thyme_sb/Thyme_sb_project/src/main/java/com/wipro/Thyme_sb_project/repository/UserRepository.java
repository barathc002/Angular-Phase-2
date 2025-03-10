package com.wipro.Thyme_sb_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.Thyme_sb_project.mode.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	

}

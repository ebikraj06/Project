package com.project.studententity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.studententity.entity.Login;

@Repository
public interface UserRepository extends JpaRepository<Login, Long>{
	Login findByEmail(String email);
}

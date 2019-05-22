package com.musictribe.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.musictribe.demo.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}

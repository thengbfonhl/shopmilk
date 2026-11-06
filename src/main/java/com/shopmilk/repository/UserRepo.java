package com.shopmilk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shopmilk.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	@Query("SELECT u FROM User u WHERE u.mail = ?1")
	User findUserByEmail(String email);

	@Query("SELECT COUNT(u) FROM User u")
	long countAllUsers();
}


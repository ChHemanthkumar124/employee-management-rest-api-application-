package com.glca.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.glca.app.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

	@Query("SELECT u FROM User u WHERE u.username = ?1")
	User findByUsername(String username);
}

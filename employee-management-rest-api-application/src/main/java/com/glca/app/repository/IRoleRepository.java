package com.glca.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glca.app.entity.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {

}

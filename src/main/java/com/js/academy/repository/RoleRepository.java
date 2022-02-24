package com.js.academy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.js.academy.model.Role;
import com.js.academy.model.RoleNames;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	//Optional<Role> findByRoleName(RoleNames roleNames);

}

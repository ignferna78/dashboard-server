package com.ccsw.dashboard.config.role;

import com.ccsw.dashboard.config.role.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RoleRepository extends CrudRepository<Role, Long>, JpaRepository<Role, Long> {
	
	Role findByRole(String role);
	Optional<Role> findById(Long id);		
}
package com.ccsw.dashboard.roleversion;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ccsw.dashboard.roleversion.model.RoleVersion;

@Repository
public interface RoleVersionRepository extends CrudRepository<RoleVersion, Long>, JpaRepository<RoleVersion, Long> {

	Optional<RoleVersion> findById(Long id);
	

}
package com.ccsw.dashboard.skill;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ccsw.dashboard.skill.model.Skill;

import java.util.List;


@Repository
public interface SkillRepository extends CrudRepository<Skill, Long>, JpaRepository<Skill, Long> {

    List<Skill> findBySkillDescription(String skill);
    List<Skill> findSkillByLocation(String location);


}

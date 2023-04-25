package com.ipl.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipl.demo.model.teams;
@Repository
public interface iplRepository extends JpaRepository<teams,Integer>{

}

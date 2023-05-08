package com.educationloan.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationloan.demo.Model.AdminModel;

@Repository
public interface AdminModelRepository extends JpaRepository<AdminModel,String>{

	void deleteByPassword(String password);
	
}

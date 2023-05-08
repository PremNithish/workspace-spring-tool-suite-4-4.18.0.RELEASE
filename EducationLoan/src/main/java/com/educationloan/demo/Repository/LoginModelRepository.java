package com.educationloan.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationloan.demo.Model.LoginModel;

@Repository
public interface LoginModelRepository extends JpaRepository<LoginModel,String>{

	void deleteByPass(String pass);

	
}
package com.educationloan.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationloan.demo.Model.UserModel;

@Repository
public interface UserModelRepository extends JpaRepository<UserModel,Integer>{

}

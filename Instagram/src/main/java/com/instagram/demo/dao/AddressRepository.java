package com.instagram.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.instagram.demo.model.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address,Long>{

}

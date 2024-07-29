package com.example.ecom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ecom.Model.adminModel;
@Repository
public interface adminRepository extends CrudRepository <adminModel,Integer>{

    
}

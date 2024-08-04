package com.example.ecom.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ecom.Model.adminModel;
// @Repository
public interface adminRepository extends MongoRepository <adminModel,Integer>{

    
}

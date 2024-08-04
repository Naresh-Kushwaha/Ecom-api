package com.example.ecom.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.ecom.Model.adminModel;
import com.example.ecom.repository.adminRepository;

@Service
public class adminService {
    @Autowired
    private adminRepository adminRepository;
    
    public String SetAdmin(adminModel admin){
        adminRepository.save(admin);
        return "saved admin details";
    }
    public void DeleteAdmin(int id){
        adminRepository.deleteById(id);
        
    }

    
}

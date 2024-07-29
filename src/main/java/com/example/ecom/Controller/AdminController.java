package com.example.ecom.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecom.Model.adminModel;
import com.example.ecom.Service.adminService;




@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    adminService adminService;

    @GetMapping("/ad")
    public String show(){
        return "Admin model";
    }

@PostMapping("/setAdmin")
public String setAdmin(@RequestBody adminModel a1){
    return adminService.SetAdmin(a1);
}
@DeleteMapping("/deleteAdmin/{id}")
public void DeleteAdmin(@PathVariable int id){
    adminService.DeleteAdmin(id);
}


    
}

package com.example.ecom.Model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "Admin_Data")
public class adminModel {
    
    
    @Id
    private int id;
    private String name;
    private long password;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPassword() {
        return password;
    }
    public void setPassword(long password) {
        this.password = password;
    }
     
    
}

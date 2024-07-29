package com.example.ecom.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class adminModel {
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE )
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

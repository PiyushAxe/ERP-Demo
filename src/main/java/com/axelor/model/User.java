package com.axelor.model;
import java.util.List;

import javax.persistence.CascadeType;
//import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 

@Entity
@Table(name="USER_TABLE")
public class User  {
     
    @Id @GeneratedValue
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String userId;
    private String password;
    private String phone;
    private String selection;
    
    @OneToMany(cascade=CascadeType.ALL)
    private List<Student> student;
 
    public User() {
    }
 
     
    public User(String firstName, String middleName, String lastName, String email, String userId, String password, String phone , List<Student> student, String selection) {
        
    	this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.userId = userId;
        this.password = password;
        this.phone = phone;
        this.student = student;
        this.selection=selection;
        
    }
 
 
    public Long getId() {
        return id;
    }
 
     public void setId(Long id) {
        this.id = id;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getMiddleName() {
        return middleName;
    }
 
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getUserId() {
        return userId;
    }
 
    public void setUserId(String userId) {
        this.userId = userId;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }  
    
    public String getPhone() {
		return phone;
	}
    
    public void setPhone(String phone) {
		this.phone = phone;
	}
    
    public List<Student> getStudent() {
		return student;
	}
    
    public void setStudent(List<Student> student) {
		this.student = student;
	}
    
    public String getSelection() {
		return selection;
	}
    
    public void setSelection(String selection) {
		this.selection = selection;
	}
      
    
}
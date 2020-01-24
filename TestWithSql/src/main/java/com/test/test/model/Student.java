package com.test.test.model;

import javax.persistence.*;

import com.sun.istack.NotNull;

@Entity
public class Student {
 
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
	@NotNull
    private String firstName;
    
	@NotNull
    private String lastName;
     
//    public Student(Long id, String firstName, String lastName, String year) {
//		super();
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.year = year;
//	}

	private String year;
 
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
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public String getYear() {
        return year;
    }
 
    public void setYear(String year) {
        this.year = year;
    }
    
    @Override
   	public String toString() {
   		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", year=" + year + "]";
   	}

}

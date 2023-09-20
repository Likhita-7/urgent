package com.example.springformexample.models;

import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
	
	 @Size(min = 3, max = 50)
	    private String name;
	     
	    @NotBlank
	    @Email(message = "Please enter a valid e-mail address")
	    private String email;
	     
	    @NotBlank
	    @Size(min = 8, max = 15)
	    private String password;
	     
	  
	     
	  
	    
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    private Date birthday;
	     
	    @NotBlank
	    private String profession;
	 
	    
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		
		public Date getBirthday() {
			return birthday;
		}

		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}

		public String getProfession() {
			return profession;
		}

		public void setProfession(String profession) {
			this.profession = profession;
		}


		
	    
	    

}

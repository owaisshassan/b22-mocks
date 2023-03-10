package com.owaiss.model;






import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@NotNull(message="Mobile number cannot be null!")
	@NotBlank(message= "Mobile field cannot be blank!")
	@Pattern(regexp = "[7896]{1}[0-9]{9}", message = "Please enter valid 10 digit mobile number")
	@Size(min = 10, max = 10, message = "Please enter valid 10 digit mobile number!")
	@Id
	private String mobileNumber;
	
	
	@NotNull(message = "First Name should not be null")
	@Pattern(regexp="^[a-zA-Z_]+( [a-zA-Z_]+)*$", message = "Please type alphabetic First Name only")
	@Size(min=3,max=16, message = "firstName should be of size min=3 and max=16")
	private String firstName;
	
	@NotNull(message = "Last Name should not be null")
	@Pattern(regexp="^[a-zA-Z_]+( [a-zA-Z_]+)*$", message = "Please type alphabetic Last Name only")
	@Size(min=3,max=16, message = "lastName should be of size min=3 and max=16")
	private String lastName;
	
	@NotNull(message = "please provide address")
	private String address;
	
	@NotNull(message = "age cannot be null")
	@Min(value = 9, message = "Age must be above 8 years")
	@Positive
	private Integer age;
	
	@NotNull(message = "please provide gender")
	@Pattern(regexp = "(?:male|Male|female|Female|transgender|Transgender|FEMALE|MALE|TRANSGENDER)$", message = "Gender must be either male or female or transgender")
	private String gender;
	
	@NotBlank(message = "password field cannot be blank!")
	@NotNull(message = "please fill the password field!")
	@Size(min = 6, max = 12, message = "Password must be 6-12 characters!")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,12}$",message = "password must have at least one special character, one upper case, one lowercase, and one digit.")
	private String password;
	

	@OneToMany
	private List<FIR> firs;
	

	
	
	
	
	
	
	
	
	
	
	
}

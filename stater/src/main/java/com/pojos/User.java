package com.pojos;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.*;

@MappedSuperclass 
@Getter
@Setter
@ToString(exclude = { "password" })
public class User  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Length(min=4, max=20, message = "Invalid or Blank first name!!!!!!")
	@Column(name = "first_name", length = 20) 
	private String firstName;
	
	@Column(name = "last_name", length = 20) 
	@NotBlank(message = "Last  name can't be blank")
	private String lastName;
	
	@Column(length = 25, unique = true)
	@Email
	private String email;
	
	@Column(length = 20, nullable = false)
	private String password;
	
	@Column(length = 15, nullable = false)
	private String mobileNo;
	
	@Enumerated(EnumType.STRING) 
	@Column(name = "user_role", length = 30)
	private Role userRole;

}
package com.pojos;

import javax.persistence.*;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity 
@Table(name = "Student")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student extends User {
	@Id
	@Column(length = 15, unique = true)
	private String PRN;
	
	@Column(name = "Roll_No", length = 20) 
	private String RollNo;
	
	@Enumerated(EnumType.STRING) 
	@Column(name = "Batch", length = 10) 
	private Batch student_batch;
	
	
}

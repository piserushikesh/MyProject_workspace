package com.pojos;

import javax.persistence.*;

import lombok.*;

@Entity 
@Table(name = "Student")
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Faculty {
	
	@Id
	@Column(length = 15, unique = true)
	private String facultyId;
	
	@Column(name = "Qualification", length = 20) 
	private String qualification;
	
	@Column(name = "Experience", length = 20) 
	private String experience;
	
	@Enumerated(EnumType.STRING) 
	@Column(name = "Batch", length = 10) 
	private Batch student_batch;
}

package com.owaiss.model;




import java.time.LocalDateTime;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FIR {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer firId;
	
	@NotNull(message = "please provide crime Detail")
	private String crimeDetail;
	
	@NotNull(message = "timeStamp cannot be null")
	private LocalDateTime timeStamp;
	
	@NotNull(message = "please provide a police Station name")
	private String policeStation;
	

	@OneToOne(mappedBy = "firs")
	private User user;


	public FIR(@NotNull(message = "please provide crime Detail") String crimeDetail,
			@NotNull(message = "timeStamp cannot be null") LocalDateTime timeStamp,
			@NotNull(message = "please provide a police Station name") String policeStation, User user) {
		super();
		this.crimeDetail = crimeDetail;
		this.timeStamp = timeStamp;
		this.policeStation = policeStation;
		this.user = user;
	}
	
	


	
	
	
}

package com.desenvolvimento.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name="USER")
public class User {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO) @Getter
	private Long userId;
	
	@Getter @Setter
	private Long companyId;
	
	@Getter @Setter
	private String email;
	
	@Getter @Setter
	private Date birthDate; 
}

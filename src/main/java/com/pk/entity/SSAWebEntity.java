package com.pk.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

/**
 * This is SSAWebEntity entity class
 * @author Pankaj Kumar
 *
 */
@Data
@Entity
@Table(name = "SSA_WEB_DETAILS")
public class SSAWebEntity {

	@Id
	@SequenceGenerator(name = "SSA_SEQ",sequenceName = "SSA_NUM_SEQ",initialValue = 100000000,allocationSize = 1)
	@GeneratedValue(generator = "SSA_SEQ")
	@Column(name = "SSN_NUMBER",length =9)
	private Long ssnNum;
	
	@Column(name = "FIRST_NAME",length = 20)
	private String fname;
	
	@Column(name = "LAST_NAME",length = 20)
	private String lname;
	
	@Column(name = "DOB")
	private Date dob;
	
	@Column(name = "GENDER",length = 10)
	private String gender;
	
	@Column(name = "STATE_CODE",length = 5)
	private String stateCode;
	
}

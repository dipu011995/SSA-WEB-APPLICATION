package com.pk.model;

import java.sql.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * This model class
 * @author Pankaj Kumar
 *
 */
@Data
@ApiModel("This Represent Model Class for SSA-WEB")
public class SSAWebModel {

	@ApiModelProperty("This Is Person First Name")
	private String fname;
	@ApiModelProperty("This Is Person Last Name")
	private String lname;
	@ApiModelProperty("This Is Oerson Date Of Birth")
	private Date dob;
	@ApiModelProperty("This Is Person gender")
	private String gender;
	@ApiModelProperty("This Is State Name")
	private String stateName;
	
}

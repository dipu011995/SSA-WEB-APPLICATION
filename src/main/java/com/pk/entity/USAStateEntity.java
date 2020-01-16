package com.pk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * This is USAStateEntity class is for USA_STATE_MASTER table
 * @author Pankaj Kumar
 *
 */
@Data
@Entity
@Table(name = "USA_STATE_MASTER")
public class USAStateEntity {

	@Id
	@GeneratedValue
	@Column(name = "STATE_ID")
	private Integer stateId;
	
	@Column(name = "STATE_CODE")
	private String stateCode;
	
	@Column(name = "STATE_NAME")
	private String stateName;
}

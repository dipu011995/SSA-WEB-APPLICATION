package com.pk.repositeries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pk.entity.USAStateEntity;
/**
 * This is repositeries Class is to talk with USA_STATE_MASTER table 
 * @author Pankaj Kumar
 *
 */
@Repository
public interface USAStateRepositeries extends JpaRepository<USAStateEntity, Integer> {

	@Query(value = "select stateName from USAStateEntity")
	public List<String> getAllStateOfUSA();
	
	@Query(value = "select stateCode from USAStateEntity where stateName = :state")
	public String findStateCodeByStateName(String state);
}

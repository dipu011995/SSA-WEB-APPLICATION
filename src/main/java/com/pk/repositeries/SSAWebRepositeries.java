package com.pk.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pk.entity.SSAWebEntity;

/**
 * This repositeries is to talk with SSA_WED_DETAILS table
 * @author Pankaj Kumar
 *
 */
@Repository
public interface SSAWebRepositeries extends JpaRepository<SSAWebEntity, Integer> {

	@Query(value = "select stateCode from SSAWebEntity where ssnNum = :ssnNo")
	public String findStateCodeBySSNNo(Long ssnNo);
	
}

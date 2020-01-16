package com.pk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.repositeries.SSAWebRepositeries;

/**
 * This is SSAWebRestServiceImpl class 
 * @author Pankaj Kumar
 *
 */
@Service
public class SSAWebRestServiceImpl implements SSAWebRestService {
	
	@Autowired
	private SSAWebRepositeries ssaRepo;
	
	/**
	 * this methode return State Code by SSN number
	 */
	@Override
	public String getStateCodeBySSNNumber(Long ssnNum) {
		return ssaRepo.findStateCodeBySSNNo(ssnNum);
	}

}

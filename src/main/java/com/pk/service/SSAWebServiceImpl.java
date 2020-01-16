package com.pk.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.entity.SSAWebEntity;
import com.pk.model.SSAWebModel;
import com.pk.repositeries.SSAWebRepositeries;
import com.pk.repositeries.USAStateRepositeries;

/**
 * This is SSAWebServiceImpl class
 * @author Pankaj Kumar
 *
 */
@Service
public class SSAWebServiceImpl implements SSAWebService {

	@Autowired
	private USAStateRepositeries stateRepo;
	
	@Autowired
	private SSAWebRepositeries ssaWebRepo;
	
	/**
	 * This method return all state name
	 */
	@Override
	public List<String> getAllStateName() {
		return stateRepo.getAllStateOfUSA();
	}
	
	/**
	 * This Method save the SSA details
	 */
	@Override
	public Long saveSSADetails(SSAWebModel ssaModel) {
		SSAWebEntity ssaWebEntity = new SSAWebEntity();
		BeanUtils.copyProperties(ssaModel, ssaWebEntity);
		
		ssaWebEntity.setStateCode(stateRepo.findStateCodeByStateName(ssaModel.getStateName()));
		
		SSAWebEntity saveEntity = ssaWebRepo.save(ssaWebEntity);
		
		if(saveEntity != null) {
			return saveEntity.getSsnNum();
		}
		return null;
	}
}

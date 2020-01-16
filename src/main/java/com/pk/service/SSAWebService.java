package com.pk.service;

import java.util.List;

import com.pk.model.SSAWebModel;

public interface SSAWebService {
	
	public List<String> getAllStateName();
	public Long saveSSADetails(SSAWebModel ssaModel);

}

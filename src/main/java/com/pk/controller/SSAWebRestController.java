package com.pk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pk.exception.SSADataNotFoundException;
import com.pk.service.SSAWebRestService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * This is SSAWebRestController class for rest call
 * @author Pankaj Kumar
 *
 */
@RestController
@Api(value = "This Is Controller class")
public class SSAWebRestController {
	
	@Autowired
	private SSAWebRestService restService;
	
	/**
	 * This Method is for rest call
	 * @param ssnNumber
	 * @return
	 */
	@ApiResponses ({
		@ApiResponse(code=200, message = "SECESS"),
		@ApiResponse(code=400, message = "BAD REQUEST"),
		@ApiResponse(code=500, message = "Server Problem")
	})
	@ApiOperation(value = "This Operation is to register Person in SSA-WEB")
	@GetMapping(value = "/getStateCode/{ssnNum}",
								produces = {"application/json"}
			)
	private  String getStateCode(@ApiParam("This param takes the SSN Number") @PathVariable("ssnNum")Long ssnNumber){
		
		String stateCode = restService.getStateCodeBySSNNumber(ssnNumber);
		
		if(stateCode == null) {	
			throw new SSADataNotFoundException();
		}
		return stateCode;
		
	}

}

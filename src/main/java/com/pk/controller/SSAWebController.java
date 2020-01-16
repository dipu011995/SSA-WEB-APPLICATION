package com.pk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pk.model.SSAWebModel;
import com.pk.service.SSAWebService;

/**
 * This is Controller class for C2B Communication
 * @author Pankaj Kumar
 *
 */
@Controller
public class SSAWebController {
	
	@Autowired
	private SSAWebService swService;

	/**
	 * This method is to display form and also solve doublePosting problem
	 * @param model
	 * @return
	 */
	@GetMapping(value = {"/" ,"/addAttribute"})
	public String displaySSAWEBForm(Model model) {
		SSAWebModel swmodel = new SSAWebModel();
		
		List<String> allStateName = swService.getAllStateName();
		model.addAttribute("allState", allStateName);
		model.addAttribute("swmodel", swmodel);
		return "ssa_web_info";
	}
 
	/**
	 * This Method handel the submit button
	 * @param swaModel
	 * @param model
	 * @param attribute
	 * @return
	 */
	@PostMapping(value = "/registerSSAAccount")
	public String registerSSA(@ModelAttribute("swmodel")SSAWebModel swaModel,Model model,RedirectAttributes attribute) {
		Long ssnNumber = swService.saveSSADetails(swaModel);
		
		String convertSSNNo = String.valueOf(ssnNumber);
		StringBuffer sb = new StringBuffer(convertSSNNo);
		
		sb.insert(3, "-");
		sb.insert(6, "-");
		
		if(ssnNumber != null) {
			attribute.addFlashAttribute("ssnNumber", "Registration Secussful..Your  SSN number is "+sb);
			return "redirect:/addAttribute";
		}
		else {
			attribute.addFlashAttribute("ssnNumber", "Registration Failed");
			return "redirect:/addAttribute";
		}
	}
	
	
}

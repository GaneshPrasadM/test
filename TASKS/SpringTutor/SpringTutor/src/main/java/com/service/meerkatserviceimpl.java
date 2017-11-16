package com.service;

import com.model.VariableModule;
import com.serviceimpl.meerkatservice;

public class meerkatserviceimpl implements meerkatservice {

	public int meerkatService(VariableModule variableModule) {
		System.out.println(" VariableModule : "+variableModule +" Reference Id  "+variableModule.getLocalRefId());
		System.out.println(" VariableModule : "+variableModule +" Reference Id  "+variableModule.getCountry());

		return 0;
	}
	
	

}

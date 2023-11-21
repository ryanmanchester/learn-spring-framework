package com.ryanmanchester.learnspringframework.calculationservice;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BusinessCalculationService {
	
	private DataService dataService;
	
	public BusinessCalculationService(@Qualifier("MongoDB Qualifier") DataService dataService) {
		this.dataService = dataService;
	}
	public int findMax() {
		return Arrays.stream(dataService.retrieveData())
				.max().orElse(0);
	}
	

}

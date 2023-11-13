package com.ryanmanchester.learnspringframework.calculationservice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MySQL Qualifier")
public class MySQLDataService implements DataService {

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] {1, 2, 3, 4, 5};
	}

}

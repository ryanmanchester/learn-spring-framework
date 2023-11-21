package com.ryanmanchester.learnspringframework.calculationservice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Qualifier("MongoDB Qualifier")
public class MongoDBDataService implements DataService {

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] {11, 22, 33, 44, 55};
	}

}

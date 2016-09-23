package com.techelevator.model.jdbc;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.techelevator.model.Vacation;

@Component
public class JDBCVacationDAO {

	
	public List<Vacation> getAllVacations() {
		
		List<Vacation> vacationList = new ArrayList<Vacation>();
		
		for(int i = 1; i <= 2; i++) {
			Vacation tempVacation = new Vacation();
			tempVacation.setVacationId(i);
			tempVacation.setLocation("Glen Coe "+i);
			tempVacation.setCountry("Scotland "+i);
			tempVacation.setDescription("Very bonnie indeed "+i);
			tempVacation.setDuration(i);
			tempVacation.setPrice(500+i);
			tempVacation.setAccommodation(true);
			vacationList.add(tempVacation);
		}
		
		return vacationList;
	}
	
	
}

package com.techelevator.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.Vacation;
import com.techelevator.model.jdbc.JDBCVacationDAO;

@Controller
public class HomeController {

	private JDBCVacationDAO vacationDAO;
	
	@Autowired
	public HomeController(JDBCVacationDAO vacationDAO) {
		this.vacationDAO = vacationDAO;
	}
	
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String Index() {
		return "index";
	}
	
	@RequestMapping(path="/displayAboutPage", method=RequestMethod.GET)
	public String displayAboutPage() {
		return "about";
	}
	
	@RequestMapping(path="/displayViewAllPage", method=RequestMethod.GET)
	public String displayViewAllPage(Map<String, Object> model) {
		List<Vacation> vacationList = vacationDAO.getAllVacations();
		model.put("vacations", vacationList);
		return "viewAll";
	}
	
	
	
	
}

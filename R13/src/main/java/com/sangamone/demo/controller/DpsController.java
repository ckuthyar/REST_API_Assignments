package com.sangamone.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.demo.model.Dps;

@RestController

public class DpsController {
	@GetMapping("/displayMessage")
	public Dps displayMessage() {
		String location="HYD";
		Dps dpsEnglish = new Dps();
		dpsEnglish.setMessage1("Well Done");
		dpsEnglish.setMessage2("Better Luck Next Time");
		
		Dps dpsHindi = new Dps();
		dpsHindi.setMessage1("Badhiyi Ho");
		dpsHindi.setMessage2("Hame Poora Vishwas Hai");
		
		if (location=="BLR") {
			return dpsEnglish;
		}
		else {
			return dpsHindi;
		}
		
	}
	

}

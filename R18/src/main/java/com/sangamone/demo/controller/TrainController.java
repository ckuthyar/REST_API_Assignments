package com.sangamone.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.demo.model.Train;
import com.sangamone.demo.repo.TrainRepository;

@RestController
public class TrainController {
	
	@Autowired
	TrainRepository trainRepository;
	
	@GetMapping("/getTrains")
	public Iterable getTrains() {
		Iterable trainlist = new ArrayList<>();
		trainlist=trainRepository.findAll();
		return trainlist;
		
	}
	
	

}

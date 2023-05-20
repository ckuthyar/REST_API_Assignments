package com.sangamone.demo.controller;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.demo.model.Train;
import com.sangamone.demo.repo.TrainRepository;

@RestController
public class TrainController {
	@Autowired
	TrainRepository trainRepository;
	
	@GetMapping("/getTrains")
	private Iterable<Train> getTrains() {
		Iterable<Train> trainlist = new ArrayList<>();
		trainlist = trainRepository.findAll();
		return trainlist;
		
	}
	@PostMapping("/addTrain")
	public String addTrain(@RequestBody Train train) {
		trainRepository.save(train);
		return "Success";
	}
	
}

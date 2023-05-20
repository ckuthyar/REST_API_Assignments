package com.sangamone.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.sangamone.demo.model.Station;

import com.sangamone.demo.repo.StationRepository;

@RestController
public class StationController {
	@Autowired
	StationRepository stationRepository;
	
	@GetMapping("/getStations")
	public Iterable<Station> getStations(){
		Iterable<Station> stationlist = new ArrayList<>();
		stationlist=stationRepository.findAll();
		return stationlist;
	}
	
	@PostMapping("/addStation")
	public String addStation(@RequestBody Station station) {
		stationRepository.save(station);
		return "Success";
		
	}
	

}

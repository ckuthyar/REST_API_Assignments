package com.sangamone.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sangamone.demo.model.Timings;
import java.util.HashMap;
import com.sangamone.demo.repo.TimingsRepository;

@RestController
public class TimingsController {
	@Autowired
	TimingsRepository timingsRepository;
	
	
	@GetMapping("/getTimings")
	public Iterable<Timings> getTimings(){
		Iterable<Timings> timingslist=timingsRepository.findAll(); 
		return timingslist;
		
	}
	
	@PostMapping("/addTimings")
	public String addTimings(@RequestBody Timings timings) {
		timingsRepository.save(timings);
		return "Success";
	}
	@GetMapping("/getTrainsByStationId")
	public Map<String, Integer> getTrainsByStationId(@RequestParam int station_id){
		Integer trainlist1 = timingsRepository.findTrainsById(station_id);
		Map<String, Integer> response = new HashMap<>();
		response.put("trainId", trainlist1);
		return response;
		
	}
	@GetMapping("/getTrainNameByStationId")
	public String getTrainNameByStationId(@RequestParam int station_id) {
		String trainlist2 = timingsRepository.findTrainNameByStationId(station_id);
		return trainlist2;
	}
	
	@GetMapping("/getTrainNameByStationCode")
	public String getTrainNameByStationCode(@RequestParam String station_code) {
		String trainlist3=timingsRepository.findTrainNameByStationCode(station_code);
		return trainlist3;
	}
	@GetMapping("/getTrainNameByStationName")
	public String getTrainNameByStationName(@RequestParam String station_name) {
		String trainlist4=timingsRepository.findTrainNameByStationName(station_name);
		return trainlist4;
	}

}

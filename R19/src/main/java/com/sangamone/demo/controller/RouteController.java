package com.sangamone.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.demo.model.Route;
import com.sangamone.demo.repo.RouteRepository;

@RestController
public class RouteController {
	
	@Autowired
	RouteRepository routeRepository;
	
	@GetMapping("/getRoutes")
	public Iterable<Route> getRoutes(){
		Iterable<Route> routelist = new ArrayList<>();
		routelist=routeRepository.findAll();
		return routelist;
	
	}
	@PostMapping("/addRoute")
	public String addRoute(@RequestBody Route route) {
		routeRepository.save(route);
		return "Success";
	}
	

}

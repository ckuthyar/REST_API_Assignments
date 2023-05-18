package com.sangamone.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.demo.model.Uttarakhand;
import com.sangamone.demo.repo.UttarakhandRepo;

@RestController
public class UttarakhandController {
	
	@Autowired
	UttarakhandRepo uttarakhandRepo;
	
	
	@PostMapping("/sendDonation")
	public String sendDonation(@RequestBody Uttarakhand uttarakhand) {
		uttarakhandRepo.save(uttarakhand);
		return "Success";
	}
	
	@GetMapping("/getAllDonation")
	public Iterable<Uttarakhand> getAllDonation() {
		Iterable<Uttarakhand> uklist = new ArrayList<>();
		uklist=uttarakhandRepo.findAll();
		return uklist;
		
	}
	@GetMapping("/getTotalDonation")
	public int getTotalDonation() {
		int total=uttarakhandRepo.getTotal();
		return total;
	}

}





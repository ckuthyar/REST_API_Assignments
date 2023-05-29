package com.sangamone.demo.controller;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.sangamone.demo.model.Votes;
import com.sangamone.demo.repo.VotesRepo;

@RestController

public class VotesController {
	@Autowired
	VotesRepo votesRepo;
	@GetMapping("/showVotes")
	public Iterable<Votes> showVotes() {
		Iterable<Votes> list1 = new ArrayList<>();
		list1 = votesRepo.findAll();
		return list1;
	}
	@PostMapping("/uploadVotes")
	public String uploadCSV(@RequestPart("file") MultipartFile file) throws CsvValidationException {
		try {
			CSVReader csvReader = new CSVReader(new InputStreamReader(file.getInputStream()));
			
			String[] nextRecord;
			csvReader.readNext();
			
			while((nextRecord=csvReader.readNext())!= null) {
				int votesParty1= Integer.parseInt(nextRecord[0]);
				int votesParty2= Integer.parseInt(nextRecord[1]);
				int votesParty3= Integer.parseInt(nextRecord[2]);
				int votesParty4= Integer.parseInt(nextRecord[3]);
				String candidateParty1 = nextRecord[4];
				String candidateParty2 = nextRecord[5];
				String candidateParty3 = nextRecord[6];
				String candidateParty4 = nextRecord[7];
				
				Votes votes = new Votes();
				votes.setVotesParty1(votesParty1);
				votes.setVotesParty2(votesParty2);
				votes.setVotesParty3(votesParty3);
				votes.setVotesParty4(votesParty4);
				votes.setCandidateParty1(candidateParty1);
				votes.setCandidateParty2(candidateParty2);
				votes.setCandidateParty3(candidateParty3);
				votes.setCandidateParty4(candidateParty4);
			
				votesRepo.save(votes);
			
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Success";
		
	}

}

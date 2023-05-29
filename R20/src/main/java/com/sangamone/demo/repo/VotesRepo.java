package com.sangamone.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.sangamone.demo.model.Votes;

public interface VotesRepo extends CrudRepository<Votes, Integer> {
	

}

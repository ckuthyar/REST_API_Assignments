package com.sangamone.demo.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sangamone.demo.model.Station;

public interface StationRepository extends CrudRepository<Station, Integer> {
	
	


}

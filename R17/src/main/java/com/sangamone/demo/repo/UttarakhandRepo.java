package com.sangamone.demo.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sangamone.demo.model.Uttarakhand;

public interface UttarakhandRepo extends CrudRepository<Uttarakhand, Integer> {
	
@Query(value = "select sum(amount) from donations", nativeQuery=true)
	int getTotal();

}

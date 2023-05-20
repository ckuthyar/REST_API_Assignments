package com.sangamone.demo.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sangamone.demo.model.Timings;

public interface TimingsRepository extends CrudRepository<Timings, Integer> {
	@Query(value= "select * from timings where station_id=?1",nativeQuery=true)

	Iterable<Timings> findTrainsById(int station_id);

}

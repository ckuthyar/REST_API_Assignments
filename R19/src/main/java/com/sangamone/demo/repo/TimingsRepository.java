package com.sangamone.demo.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sangamone.demo.model.Timings;

public interface TimingsRepository extends CrudRepository<Timings, Integer> {
	@Query(value= "select train_id from timings where station_id=?1",nativeQuery=true)
	Integer findTrainsById(int station_id);
	
	@Query(value="select train_name, arrival_time, departure_time from timings inner join trains where timings.train_id=trains.train_id and station_id=?1", nativeQuery=true)
	String findTrainNameByStationId(int station_id);
	
	@Query(value="select train_name, station_code, arrival_time, departure_time from timings inner join trains on timings.train_id=trains.train_id inner join stations on timings.station_id=stations.station_id where station_code=?", nativeQuery=true)
	String findTrainNameByStationCode(String station_code);
	
	@Query(value="select train_name, station_code, arrival_time, departure_time from timings inner join trains on timings.train_id=trains.train_id inner join stations on timings.station_id=stations.station_id where station_name=?", nativeQuery=true)
	String findTrainNameByStationName(String station_name);

}

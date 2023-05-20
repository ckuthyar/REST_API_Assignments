package com.sangamone.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.sangamone.demo.model.Train;

public interface TrainRepository extends CrudRepository<Train, Integer> {

}

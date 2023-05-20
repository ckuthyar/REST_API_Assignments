package com.sangamone.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trains")

public class Train {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int train_id;
	public int getTrain_id() {
		return train_id;
	}
	public void setTrain_id(int train_id) {
		this.train_id = train_id;
	}
	private int train_number;
	private String train_name;
	public int getTrain_number() {
		return train_number;
	}
	public void setTrain_number(int train_number) {
		this.train_number = train_number;
	}
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	

}

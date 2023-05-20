package com.sangamone.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trains")
public class Train {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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

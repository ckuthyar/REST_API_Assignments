package com.sangamone.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="timings")
public class Timings {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int timings_id;
	private int train_id;
	private int station_id;
	private String arrival_time;
	private String departure_time;
	
	@ManyToOne
	@JoinColumn(name="train_id", insertable=false, updatable=false)
	private Train train;
	
	@ManyToOne
	@JoinColumn(name="station_id", insertable=false, updatable=false)
	private Station station;
	
	public int getTimings_id() {
		return timings_id;
	}
	public void setTimings_id(int timings_id) {
		this.timings_id = timings_id;
	}
	
	public int getTrain_id() {
		return train_id;
	}
	public void setTrain_id(int train_id) {
		this.train_id = train_id;
	}
	public int getStation_id() {
		return station_id;
	}
	public void setStation_id(int station_id) {
		this.station_id = station_id;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	

}

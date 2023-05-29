package com.sangamone.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="votes")

public class Votes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int seat_id;
	private String candidateParty1;
	private String candidateParty2;
	private String candidateParty3;
	private String candidateParty4;
	private int votesParty1;
	private int votesParty2;
	private int votesParty3;
	private int votesParty4;
	private String winningParty;
	private int votesWinningParty;
	public int getSeat_id() {
		return seat_id;
	}
	public void setSeat_id(int seat_id) {
		this.seat_id = seat_id;
	}
	
	public String getCandidateParty1() {
		return candidateParty1;
	}
	public void setCandidateParty1(String candidateParty1) {
		this.candidateParty1 = candidateParty1;
	}
	public String getCandidateParty2() {
		return candidateParty2;
	}
	public void setCandidateParty2(String candidateParty2) {
		this.candidateParty2 = candidateParty2;
	}
	public String getCandidateParty3() {
		return candidateParty3;
	}
	public void setCandidateParty3(String candidateParty3) {
		this.candidateParty3 = candidateParty3;
	}
	public String getCandidateParty4() {
		return candidateParty4;
	}
	public void setCandidateParty4(String candidateParty4) {
		this.candidateParty4 = candidateParty4;
	}
	public int getVotesParty1() {
		return votesParty1;
	}
	public void setVotesParty1(int votesParty1) {
		this.votesParty1 = votesParty1;
	}
	public int getVotesParty2() {
		return votesParty2;
	}
	public void setVotesParty2(int votesParty2) {
		this.votesParty2 = votesParty2;
	}
	public int getVotesParty3() {
		return votesParty3;
	}
	public void setVotesParty3(int votesParty3) {
		this.votesParty3 = votesParty3;
	}
	public int getVotesParty4() {
		return votesParty4;
	}
	public void setVotesParty4(int votesParty4) {
		this.votesParty4 = votesParty4;
	}
	public String getWinningParty() {
		return winningParty;
	}
	public void setWinningParty(String winningParty) {
		this.winningParty = winningParty;
	}
	public int getVotesWinningParty() {
		return votesWinningParty;
	}
	public void setVotesWinningParty(int votesWinningParty) {
		this.votesWinningParty = votesWinningParty;
	}
	

}

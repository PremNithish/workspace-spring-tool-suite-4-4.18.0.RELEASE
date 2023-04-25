package com.ipl.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class teams {

	@Id
	private int teamno;
	
	private String teamname;
	private int wins;
	private int loses;
	private int points;
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLoses() {
		return loses;
	}
	public void setLoses(int loses) {
		this.loses = loses;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
}

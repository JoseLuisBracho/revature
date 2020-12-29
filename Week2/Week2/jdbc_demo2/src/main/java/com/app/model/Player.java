package com.app.model;

import java.util.Date;

public class Player {
	private int playerid;
	private String playername;
	private int teamid;
	private String teamname;
	private int age;
	private String position;
	private Date dob;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int playerid, String playername, int teamid, String teamname, int age, String position, Date dob) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.teamid = teamid;
		this.teamname = teamname;
		this.age = age;
		this.position = position;
		this.dob = dob;
	}

	public int getPlayerid() {
		return playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public int getTeamid() {
		return teamid;
	}

	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", playername=" + playername + ", teamid=" + teamid + ", teamname=" + teamname
				+ ", age=" + age + ", position=" + position + ", dob=" + dob + "]";
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	
	

}

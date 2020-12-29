package com.app.model;

import java.util.Date;

public class Player {
	private int playerid;
	private String playername;
	private int teamid;
	private int age;
	private String position;
	private Date dob;
	private long contact;
	private String teamname;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int playerid, String playername, int teamid, int age, String position, Date dob, long contact, String teamname) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.teamid = teamid;
		this.age = age;
		this.position = position;
		this.dob = dob;
		this.contact = contact;
		this.teamname = teamname;
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
		return "Player [playerid=" + playerid + ", playername=" + playername + ", teamid=" + teamid + ", age=" + age
				+ ", position=" + position + ", dob=" + dob + ", contact=" + contact + ", teamname=" + teamname + "]";
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	
	

}

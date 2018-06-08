package com.zn.controller.pojo;

import java.sql.Timestamp;

public class Suser {
	private Integer score;
	private String kemu;
	private Timestamp ctime;
	
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getKemu() {
		return kemu;
	}
	public void setKemu(String kemu) {
		this.kemu = kemu;
	}
	public Timestamp getCtime() {
		return ctime;
	}
	public void setCtime(Timestamp ctime) {
		this.ctime = ctime;
	}
	
	

}

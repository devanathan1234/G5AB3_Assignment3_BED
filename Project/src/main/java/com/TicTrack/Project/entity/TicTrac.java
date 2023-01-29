package com.TicTrack.Project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TicTrac")
public class TicTrac {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "T_Title", nullable = false)
	private String Tick;
	
	@Column(name = "T_Description", nullable = false)
	private String TicDesc;
	
	@Column(name = "createdOn", nullable = false)
	private long created;
	
	
	public TicTrac() {
		
	}
	
	public TicTrac(String tick, String ticDesc, long created) {
		super();
		Tick = tick;
		TicDesc = ticDesc;
		this.created = created;
	}
	public int getId() {
	
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTick() {
		return Tick;
	}
	public void setTick(String tick) {
		Tick = tick;
	}
	public String getTicDesc() {
		return TicDesc;
	}
	public void setTicDesc(String ticDesc) {
		TicDesc = ticDesc;
	}
	public long getCreated() {
		return created;
	}
	public void setCreated(long created) {
		this.created = created;
	}
	
	

}

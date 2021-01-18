package com.xworkz.roseplant.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="rose_plant_table")
public class RosePlantDTO implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ROSE_ID")
	private int roseID;
	
	@Column(name="ROSE_COLOR")
	private String roseColor;
	
	@Column(name="ROSE_PRICE")
	private double rosePrice;
	
	@Column(name="ROSE_HYBRID")
	private boolean hybrid;
	
	@Column(name="ROSE_SEASONABLE")
	private boolean seasonable;
	
	@Column(name="ROSE_SIZE")
	private String roseSize;
	
	@Column(name="ROSE_THORON")
	private boolean thoron;
	public RosePlantDTO()
	{
		
	}
	
	public RosePlantDTO(String roseColor, double rosePrice, boolean hybrid, boolean seasonable, String roseSize,
			boolean thoron) {
		super();
		this.roseColor = roseColor;
		this.rosePrice = rosePrice;
		this.hybrid = hybrid;
		this.seasonable = seasonable;
		this.roseSize = roseSize;
		this.thoron = thoron;
	}
	
	
	public int getRoseID() {
		return roseID;
	}
	public void setRoseID(int roseID) {
		this.roseID = roseID;
	}
	public String getRoseColor() {
		return roseColor;
	}
	public void setRoseColor(String roseColor) {
		this.roseColor = roseColor;
	}
	public double getRosePrice() {
		return rosePrice;
	}
	public void setRosePrice(double rosePrice) {
		this.rosePrice = rosePrice;
	}
	public boolean isHybrid() {
		return hybrid;
	}
	public void setHybrid(boolean hybrid) {
		this.hybrid = hybrid;
	}
	public boolean isSeasonable() {
		return seasonable;
	}
	public void setSeasonable(boolean seasonable) {
		this.seasonable = seasonable;
	}
	public String getRoseSize() {
		return roseSize;
	}
	public void setRoseSize(String roseSize) {
		this.roseSize = roseSize;
	}
	public boolean isThoron() {
		return thoron;
	}
	public void setThoron(boolean thoron) {
		this.thoron = thoron;
	}
	
	
	@Override
	public String toString() {
		return "RosePlantDTO [roseID=" + roseID + ", roseColor=" + roseColor + ", rosePrice=" + rosePrice + ", hybrid="
				+ hybrid + ", seasonable=" + seasonable + ", roseSize=" + roseSize + ", thoron=" + thoron + "]";

	
}
}

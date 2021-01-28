package com.xworkz.house.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="house_table")
public class HouseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="HOUSE_ID")
	private int houseId;
	
	@Column(name="HOUSE_NAME")
	private String houseName;
	
	@Column(name="HOUSE_LOCATION")
	private String houseLocation;
	
	@Column(name="HOUSE_COLOR")
	private String HouseColor;
	
	@Column(name="NO_OF_MEMBERS")
	private int noOfMemebers;
	

	public HouseDTO() {
		
	}
	public HouseDTO(String houseName,String houseLocation,String houseColor,int noOfMembers){
		this.houseName=houseName;
		this.houseLocation=houseLocation;
		this.HouseColor=houseColor;
		this.noOfMemebers=noOfMembers;
	}
	public void setHouseName(String houseName) {
		this.houseName=houseName;
		
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseId(int houseId) {
		this.houseId=houseId;
	}
	public int getHouseId() {
		return houseId;
	}
	public void setHouseLocation(String houseLocation) {
		this.houseLocation=houseLocation;
	}
	public String getHouseLocation() {
		return houseLocation;
	}
	public void setHouseColo(String houseColor) {
		this.HouseColor=houseColor;
	}
	public String getHouseColor() {
		return HouseColor;
	}
	public void setNoOfMembers(int noOfMembers) {
		this.noOfMemebers=noOfMembers;
	}
	public int getNoOfMembers() {
		return noOfMemebers;
	}
	@Override
	public String toString() {
		return houseId+houseName+houseLocation+HouseColor+noOfMemebers;
		
	}
}

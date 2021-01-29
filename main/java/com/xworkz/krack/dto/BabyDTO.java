package com.xworkz.krack.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "baby_table")
public class BabyDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BABY_ID")
	private int babyId;
	@Column(name = "BABY_NAME")
	private String babyName;
	@Column(name = "BABY_COLOR")
	private String babyColor;
	@Column(name = "BABY_AGE")
	private int babyAge;

	public BabyDTO() {

	}

	public BabyDTO(String babyName, String babyColor, int babyAge) {
		this.babyName = babyName;
		this.babyColor = babyColor;
		this.babyAge = babyAge;

	}

	public String getBabyName() {
		return babyName;
	}

	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}

	public String getBabyColor() {
		return babyColor;
	}

	public void setBabyColor(String babyColor) {
		this.babyColor = babyColor;
	}

	public int getBabyAge() {
		return babyAge;
	}

	public void setBabyAge(int babyAge) {
		this.babyAge = babyAge;
	}

	@Override
	public String toString() {
		return "BabyDTO [babyId=" + babyId + ", babyName=" + babyName + ", babyColor=" + babyColor + ", babyAge="
				+ babyAge + "]";
	}

}

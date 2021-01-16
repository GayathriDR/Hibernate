package com.learn.hiber.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="collegedto_table")
public class CollegeDTO implements Serializable {
	
	@Id
	@Column(name="COLLEGEID")
	private int collegeId;
	
	@Column(name="CNAME")
	private String cname;
	
	@Column(name="CLOCATION")
	private String clocation;
	
	@Column(name="NOOFSTUDENTS")
	private int noOfStudents;
	
	
	@Column(name="NOOFCLASSROOMS")
	private int noOfClassRooms;
	
	@Column(name="NOOFBRANCHES")
	private int noOfBranches;
	
	public CollegeDTO()
	{
		System.out.println("collegeDTO is created");
		System.out.println(this.getClass().getSimpleName());
	}
	
	
	public CollegeDTO( String cname, String clocation, int noOfStudents, int noOfClassRooms,
			int noOfBranches) 
	{
//		this.collegeId = collegeId;
		this.cname = cname;
		this.clocation = clocation;
		this.noOfStudents = noOfStudents;
		this.noOfClassRooms = noOfClassRooms;
		this.noOfBranches = noOfBranches;
	}





	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getClocation() {
		return clocation;
	}
	public void setClocation(String clocation) {
		this.clocation = clocation;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public int getNoOfClassRooms() {
		return noOfClassRooms;
	}
	public void setNoOfClassRooms(int noOfClassRooms) {
		this.noOfClassRooms = noOfClassRooms;
	}
	public int getNoOfBranches() {
		return noOfBranches;
	}
	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}
	@Override
	public String toString() {
		return collegeId+","+cname+","+clocation+","+noOfStudents+","+noOfBranches+","+noOfClassRooms ;
//				"CollegeDTO [collegeId:" + collegeId + ", cname=" + cname + ", clocation=" + clocation
//				+ ", noOfStudents=" + noOfStudents + ", noOfClassRooms=" + noOfClassRooms + ", noOfBranches="
//				+ noOfBranches + "]";
	}
	
	

}

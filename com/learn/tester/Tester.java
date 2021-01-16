package com.learn.tester;

import java.util.Scanner;

import com.learn.hiber.dao.CollegeDAO;
import com.learn.hiber.dao.CollegeDAOImpl;
import com.learn.hiber.dto.CollegeDTO;

public abstract class Tester {

	public static void main(String[] args) {
		System.out.println("1------>save");
		System.out.println("2------>fetch");
		System.out.println("3------>update");
		System.out.println("4------>delete");
		System.out.println("select your choice operation");
		Scanner scanner = new Scanner(System.in);
		int choice=scanner.nextInt();
		switch(choice) {
		case 1:
			CollegeDTO collegeDTO=new CollegeDTO();
			Scanner data=new Scanner(System.in);
			System.out.println("enter the name of the college");
			String cname=data.next();
			collegeDTO.setCname(cname);
			System.out.println("enter the location of the college");
			String cLoc=data.next();
			collegeDTO.setClocation(cLoc);
			System.out.println("enter the noofstudents");
			int noOfStudents=data.nextInt();
			collegeDTO.setNoOfStudents(noOfStudents);
			System.out.println("enter the number of classrooms");
			int noOfClassRoom=data.nextInt();
			collegeDTO.setNoOfClassRooms(noOfClassRoom);
			System.out.println("enter the number of branches");
			int noOfBranches=data.nextInt();
			collegeDTO.setNoOfBranches(noOfBranches);
			CollegeDAO daoImpl=new CollegeDAOImpl();
			daoImpl.saveCollegeDTO(collegeDTO);

			break;
		case 2:
			Scanner collegeId=new Scanner(System.in);
			System.out.println("enter the collegeid to fetch the collegeinfo");
			int cId=collegeId.nextInt();
			CollegeDAO daoGetInfo=new CollegeDAOImpl();
			daoGetInfo.fetchCollege(cId);

			break;
		case 3:
			Scanner updateInfo = new Scanner(System.in);
			System.out.println("enter the collegeid to update the information");
			int cIdUpdate=updateInfo.nextInt();
			CollegeDAO daoUpdateInfo=new CollegeDAOImpl();
			daoUpdateInfo.updateCollege(cIdUpdate);
			break;
		case 4:
			Scanner deleteCollegeInfo=new Scanner(System.in);
			System.out.println("enter the collegeid to delete");
			int delCollegeId=deleteCollegeInfo.nextInt();
			CollegeDAO collegeDel=new CollegeDAOImpl();
			collegeDel.deleteCollege(delCollegeId);
			
			break;
		default:
			System.out.println("you have selected the wrong choice please enter proper choice");
			break;
			
			

		}
		System.out.println("final updations for git");




	}

}

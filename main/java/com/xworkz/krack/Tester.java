package com.xworkz.krack;

import java.util.Scanner;

import com.xworkz.krack.dao.BabyDAO;
import com.xworkz.krack.dao.BabyDAOImpl;
import com.xworkz.krack.dto.BabyDTO;

public class Tester {

	public static void main(String[] args) {
		BabyDTO babyDTO=new BabyDTO();
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the babyname");
		String bName=scn.next();
		babyDTO.setBabyName(bName);
		System.out.println("enter the babycolor");
		String bColor=scn.next();
		babyDTO.setBabyColor(bColor);
		System.out.println("enter the baby age");
		int bAge=scn.nextInt();
		babyDTO.setBabyAge(bAge);
		BabyDAO babyImpl=new BabyDAOImpl();
		babyImpl.saveBabyData(babyDTO);
		
		
		
		
		

	}

}

package com.xworkz.roseplant;

import java.util.Scanner;

import com.xworkz.roseplant.dao.RosePlantDAO;
import com.xworkz.roseplant.dao.RosePlantDAOImpl;
import com.xworkz.roseplant.dto.RosePlantDTO;


public class Tester {

	public static void main(String[] args) {
		System.out.println("1-------->saveroseplant");
		System.out.println("2-------->fetchroseplant");
		System.out.println("3-------->updateroseplant");
		System.out.println("4-------->deleteroseplant");
		Scanner scn1=new Scanner(System.in);
		int choice=scn1.nextInt();
		switch(choice)
		{
		case 1:
			RosePlantDTO rosePlantDTO = new RosePlantDTO();
			Scanner scn=new Scanner(System.in);
			System.out.println("enter the rosecolor\n");
			String rColor=scn.next();
			rosePlantDTO.setRoseColor(rColor);
			System.out.println("enter the roseprice \n");
			double rPrice=scn.nextDouble();
			rosePlantDTO.setRosePrice(rPrice);
			System.out.println("enter the rose hybrid\n");
			boolean rHybrid=scn.nextBoolean();
			rosePlantDTO.setHybrid(rHybrid);
			System.out.println("enter the rose seasonable\n");
			boolean rSeason=scn.nextBoolean();
			rosePlantDTO.setSeasonable(rSeason);
			System.out.println("enter the rose size\n");
			String rSize=scn.next();
			rosePlantDTO.setRoseSize(rSize);
			System.out.println("enter the rose thoron\n");
			boolean rThoron=scn.nextBoolean();
			rosePlantDTO.setThoron(rThoron);
			RosePlantDAO daoImpl=new RosePlantDAOImpl();
			daoImpl.saveRosePlant(rosePlantDTO);
			
			break;
		case 2:
			Scanner roseId=new Scanner(System.in);
			System.out.println("enter the roseplant id to fetch");
			int rosePlantId=roseId.nextInt();
			RosePlantDAO daoFetch=new RosePlantDAOImpl();
			daoFetch.fetchRosePlant(rosePlantId);
			
			break;
		case 3:
			Scanner updateRoseId=new Scanner(System.in);
			System.out.println("enter the roseplant id to be update");
			int updateRosePlantId=updateRoseId.nextInt();
			RosePlantDAO daoUpdate=new RosePlantDAOImpl();
			daoUpdate.updateRosePlant(updateRosePlantId);
			
			break;
		case 4:
			Scanner deleteScn=new Scanner(System.in);
			System.out.println("enter the roseplant id to delete");
			int delRoseId=deleteScn.nextInt();
			RosePlantDAO delDaoImpl=new RosePlantDAOImpl();
			delDaoImpl.deleteRosePlant(delRoseId);
			
			break;
			
		default:System.out.println(" you have selected the wrong option \n");
			
		break;
		}
		
		
		

	}

}

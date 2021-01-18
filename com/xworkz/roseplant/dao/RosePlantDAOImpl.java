package com.xworkz.roseplant.dao;

import java.util.Objects;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkx.singleconnection.SingleSessionFactory;
import com.xworkz.roseplant.dao.RosePlantDAO;
import com.xworkz.roseplant.dto.RosePlantDTO;

public class RosePlantDAOImpl implements RosePlantDAO {
	
	

	public void saveRosePlant(RosePlantDTO rosePlantDTO) {
		Session session=null;
		System.out.println("invoked  saveroseplant");
		try {
			SessionFactory sessionFactory=SingleSessionFactory.getSingleFactory();
			session=sessionFactory.openSession();
			session.beginTransaction();
			session.save(rosePlantDTO);
			session.getTransaction().commit();
//			SingleSessionFactory.closeSingleFactory();
			System.out.println("done with saveroseplant");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			if(Objects.nonNull(session)) {
				session.close();
				System.out.println("session closed");
			}
			else {
				System.out.println("session not closed");
			}
		}
		
		
		
		
		
	}

	public void fetchRosePlant(int roseId) {
		Session session=null;
		System.out.println("invoking the fetchroseplant");
		try {
			SessionFactory sessionFactory=SingleSessionFactory.getSingleFactory();
			session=sessionFactory.openSession();
			RosePlantDTO rosePlantDTO=session.get(RosePlantDTO.class, roseId);
			System.out.println(rosePlantDTO);
			System.out.println("done with fetchroseplant");
//			SingleSessionFactory.closeSingleFactory();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(Objects.nonNull(session))
			{
				session.close();
				System.out.println("session closed");
			}
			else {
				System.out.println("session not closed");
			}
		}
	
		
	}

	public void updateRosePlant(int roseId) {
		Session session=null;
		System.out.println("invoked updateRoseplant");
		try {
			SessionFactory sessionFactory=SingleSessionFactory.getSingleFactory();
			session=sessionFactory.openSession();
			
			RosePlantDTO rosePlantDTO=session.get(RosePlantDTO.class, roseId);
			System.out.println("enter the new rose color \n ");
			Scanner scn=new Scanner(System.in);
			String rColor=scn.next();
			rosePlantDTO.setRoseColor(rColor);
			System.out.println("enter is rose hybrid \n ");
			boolean roseHybrid=scn.nextBoolean();
			rosePlantDTO.setHybrid(roseHybrid);
			System.out.println("enter is rose price\n ");
			double rosePrice=scn.nextDouble();
			rosePlantDTO.setRosePrice(rosePrice);
			System.out.println("enter is rose size \n ");
			String roseSize=scn.next();
			rosePlantDTO.setRoseSize(roseSize);
			System.out.println("enter is rose seasonable \n ");
			boolean roseSeason=scn.nextBoolean();
			rosePlantDTO.setSeasonable(roseSeason);
			System.out.println("enter is rose thron \n ");
			boolean roseThron=scn.nextBoolean();
			rosePlantDTO.setThoron(roseThron);
			session.beginTransaction();
			session.save(rosePlantDTO);
			session.getTransaction().commit();
			System.out.println("done with update roseplant");
			SingleSessionFactory.closeSingleFactory();
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			if(Objects.nonNull(session)) {
				session.close();
				System.out.println("session closed");
			}
			else {
				System.out.println("session not closed");
			}
		}
		
	}

	public void deleteRosePlant(int roseId) {
		System.out.println("invoked deleteRoseplant");
		Session session=null;
		try {
			SessionFactory sessionFactory=SingleSessionFactory.getSingleFactory();
			session=sessionFactory.openSession();
			 RosePlantDTO rosePlantDTO=session.get(RosePlantDTO.class, roseId);
			 session.beginTransaction();
			 session.delete(rosePlantDTO);
			 session.getTransaction().commit();
			 System.out.println("done with deleRoseplantDTO");
			
		} 
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			if(Objects.nonNull(session)) {
				session.close();
				System.out.println("session closed");
			}
			else {
				System.out.println("session not closed");
			}
		}
		
	}

}


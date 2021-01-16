package com.learn.hiber.dao;

import java.util.Objects;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learn.hiber.dto.CollegeDTO;
import com.xworkx.singleconnection.SingleSessionFactory;

public class CollegeDAOImpl implements CollegeDAO {

	@Override
	public void saveCollegeDTO(CollegeDTO collegeDTO) {
		System.out.println("invoked saveCollegeDTO");
		Session session=null;
		try
		{
			SessionFactory sessionFactory=SingleSessionFactory.getSingleFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.persist(collegeDTO);
			session.getTransaction().commit();
			System.out.println("saveCollegeDTO  method is completed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(session!=null)
			{
				session.close();
				System.out.println("session is closed");
			}
			else
			{
				System.out.println("session not closed");
			}


		}


	}

	@Override
	public void fetchCollege(int collegeId) {
		System.out.println("invoked fetchCollege");

		Session session=null;
		try
		{
			SessionFactory sessionFactory=SingleSessionFactory.getSingleFactory();
			session=sessionFactory.openSession();
			CollegeDTO collegeDTO=session.get(CollegeDTO.class, collegeId);
			System.out.println(collegeDTO);
			System.out.println("fetched the data");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(Objects.nonNull(session))
			{
				session.close();
				System.out.println("session is closed");
			}
			else
			{
				System.out.println("session not closed");
			}
		}


	}

	@Override
	public void updateCollege(int collegeId) { 
		System.out.println("invoked updateCollege");
		Session session=null;
		try
		{
			SessionFactory sessionFactory=SingleSessionFactory.getSingleFactory();
			session=sessionFactory.openSession();
			CollegeDTO collegeDTO=session.get(CollegeDTO.class, collegeId);
			Scanner scn=new Scanner(System.in);
			System.out.println("enter the new college name");
			String cName=scn.next();
			collegeDTO.setCname(cName);
			System.out.println("enter the college location");
			String cLoc=scn.next();
			collegeDTO.setClocation(cLoc);
//			collegeDTO.setClocation("mandya");
//			collegeDTO.setCname("pes University");
			System.out.println("enter the number of branches");
			int nBranch=scn.nextInt();
			collegeDTO.setNoOfBranches(nBranch);
//			collegeDTO.setNoOfBranches(20);
			System.out.println("enter the number of class rooms");
			int nClassRoom=scn.nextInt();
			collegeDTO.setNoOfClassRooms(nClassRoom);
//			collegeDTO.setNoOfClassRooms(500);
			System.out.println("enter the number of students");
			int numberStudent=scn.nextInt();
			collegeDTO.setNoOfStudents(numberStudent);
			session.beginTransaction();
			session.save(collegeDTO);
			session.getTransaction().commit();
			System.out.println("updateCollege info ");

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(Objects.nonNull(session))
			{
				session.close();
				System.out.println("session closed");
			}
			else
			{
				System.out.println("session not closed");
			}
		}


	}

	@Override
	public void deleteCollege(int collegeId) {
		System.out.println("invoked deletecollege");
		//		SessionFactory sessionFactory=null;
		Session session=null;
		try {
			SessionFactory sessionFactory=SingleSessionFactory.getSingleFactory();
			session=sessionFactory.openSession();
			CollegeDTO collegeDTO=session.get(CollegeDTO.class,collegeId);
			session.beginTransaction();
			session.remove(collegeDTO);
			//session.delete(collegeDTO);
			session.getTransaction().commit();
			System.out.println("done with deletecollege");

		}
		catch(Exception e){
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



}

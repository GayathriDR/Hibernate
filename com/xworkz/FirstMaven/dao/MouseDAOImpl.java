package com.xworkz.FirstMaven.dao;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkx.singleconnection.SingleSessionFactory;
import com.xworkz.FirstMaven.dto.MouseDTO;

public class MouseDAOImpl implements MouseDAO {

	public void saveMouseData(MouseDTO mouseDTO) {
		System.out.println("invoking the savemousedata");
		Session session=null;
		try {
			

			SessionFactory sessionFactory=SingleSessionFactory.getSingleFactory();
			System.out.println("sessionfactory created");
//			SessionFactory sessionFactory=SingleSessionFactory.getSingleFactory();
			session=sessionFactory.openSession();
			session.beginTransaction();
			session.save(mouseDTO);
			session.getTransaction().commit();
//			SingleSessionFactory.closeSingleFactory();
			System.out.println("done with saveMousedata");
			
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		finally{
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

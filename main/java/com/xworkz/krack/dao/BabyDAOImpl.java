package com.xworkz.krack.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkx.singleconnection.SingleSessionFactory;
import com.xworkz.krack.dto.BabyDTO;

public class BabyDAOImpl implements BabyDAO {

	@Override
	public void saveBabyData(BabyDTO babyDTO) {
		System.out.println("invoking the babydata");
		Session session=null;
		Transaction transaction=null;
		try {
//			Configuration con=new Configuration();
//			con.configure();
//			System.out.println("stated configuration");
//			SessionFactory  sessionFactory=con.buildSessionFactory();
//			System.out.println("stated sessionFactory");
//			session=sessionFactory.openSession();
//			System.out.println("stated session");
//			session.beginTransaction();
//			System.out.println("stated begintransaction");
//			session.save(babyDTO);
//			System.out.println("stated saving");
//			session.getTransaction().commit();
			SessionFactory sessionFactory=SingleSessionFactory.getSingleFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.save(babyDTO);
			transaction.commit();
			SingleSessionFactory.closeSingleFactory();
//			
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		finally {
			if(session!=null) {
				session.close();
			}
			else {
				System.out.println("session not closed");
			}
		}
		

	}

}

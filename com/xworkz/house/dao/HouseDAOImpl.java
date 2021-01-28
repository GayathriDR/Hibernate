package com.xworkz.house.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkx.singleconnection.SingleSessionFactory;
import com.xworkz.house.dto.HouseDTO;

public class HouseDAOImpl implements HouseDAO{

	@Override
	public void addHouseInfo(HouseDTO houseDTO) {
		System.out.println("invoking the addhouseinfo");
		Session session=null;
		Transaction transaction=null;
		try {
			SessionFactory sessionFactory=SingleSessionFactory.getSingleFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.save(houseDTO);
			transaction.commit();
			
			
		}
		catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
		
	}

}

package com.springdemo.entities.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.springdemo.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Getting current session");
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		System.out.println("starting a transaction");
		currentSession.beginTransaction();
		
		System.out.println("Storing employee in the database");
		currentSession.save(employee);
		
		System.out.println("Succesful! committing transaction");
		currentSession.getTransaction().commit();
			
		
	}

	
}

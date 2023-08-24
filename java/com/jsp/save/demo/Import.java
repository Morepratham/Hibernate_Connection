package com.jsp.save.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Import {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Aniruddha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Pen p1 = new Pen();
		p1.setName("Apsara");
		p1.setBrand("Cello");
		p1.setColour("Black");
		
		entityTransaction.begin();
		entityManager.persist(p1);
		entityTransaction.commit();
	}

}

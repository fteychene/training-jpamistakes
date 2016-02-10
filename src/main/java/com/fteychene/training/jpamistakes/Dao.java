package com.fteychene.training.jpamistakes;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {
	
	@Autowired
	private EntityManager entityManager;
	
	
	public void test() {
		System.out.println(entityManager);
	}

}

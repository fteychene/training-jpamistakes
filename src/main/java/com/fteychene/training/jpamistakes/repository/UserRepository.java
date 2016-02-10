package com.fteychene.training.jpamistakes.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fteychene.training.jpamistakes.entity.User;

@Repository
public class UserRepository {
	
	@Autowired
	private EntityManager entityManager;
	
	public User create(User aUser) {
		entityManager.persist(aUser);
		return aUser;
	}

}

package com.talentua.jersey.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.talentua.jersey.model.Usuarios;

@Resource
public class UserDao {
	
	@PersistenceContext
    private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Usuarios> findUsers() {
        Query query = entityManager.createQuery("Select u FROM Usuarios u");
        return (List<Usuarios>)query.getResultList();
    }

}

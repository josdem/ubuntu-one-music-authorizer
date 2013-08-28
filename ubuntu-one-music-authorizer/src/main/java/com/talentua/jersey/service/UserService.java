package com.talentua.jersey.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.talentua.jersey.dao.UserDao;
import com.talentua.jersey.model.Usuarios;

@Stateless
public class UserService {

	@Inject
    private UserDao userDao;

    public Usuarios getUser(Integer userId) {
        return userDao.findUsers().get(userId);
    }

	public List<Usuarios> getUsers() {
		return userDao.findUsers();
	}
    
}

package org.ubuntuone.music.authorizer.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.ubuntuone.music.authorizer.dao.UserDao;
import org.ubuntuone.music.authorizer.model.Usuarios;


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

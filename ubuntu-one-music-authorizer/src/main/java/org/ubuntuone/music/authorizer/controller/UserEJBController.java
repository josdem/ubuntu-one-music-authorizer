package org.ubuntuone.music.authorizer.controller;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.ubuntuone.music.authorizer.model.Usuarios;
import org.ubuntuone.music.authorizer.service.UserService;


@Named("users")
@RequestScoped
public class UserEJBController {

	@EJB
	private UserService userService;
	
	public Usuarios getUser(){
		return userService.getUser(0);
	}
	
}

package com.talentua.jersey.controller;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.talentua.jersey.model.Usuarios;
import com.talentua.jersey.service.UserService;

@Named("users")
@RequestScoped
public class UserEJBController {

	@EJB
	private UserService userService;
	
	public Usuarios getUser(){
		return userService.getUser(0);
	}
	
}

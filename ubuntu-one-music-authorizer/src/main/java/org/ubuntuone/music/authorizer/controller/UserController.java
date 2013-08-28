package org.ubuntuone.music.authorizer.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ubuntuone.music.authorizer.model.Usuarios;
import org.ubuntuone.music.authorizer.service.UserService;


@RequestScoped
@Path("/user")
public class UserController {
	
	@EJB
	private UserService userService;

	@GET
	@Path("/get/{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuarios getUser(@PathParam("userId") Integer userId) {
		return userService.getUser(userId);
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuarios> getUsers() {
		return userService.getUsers();
	}
	
}
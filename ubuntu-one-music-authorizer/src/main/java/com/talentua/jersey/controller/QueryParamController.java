package com.talentua.jersey.controller;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.talentua.jersey.model.Usuarios;
import com.talentua.jersey.service.UserService;

@RequestScoped
@Path("/query")
public class QueryParamController {
	
	@EJB
	private UserService userService;
	
	private Log log = LogFactory.getLog(getClass());
	
	@GET
	@Path("/user")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuarios getQuery(@QueryParam("userId") int userId) {
		log.info("userId: " + userId);
		return userService.getUser(userId);	
	} 

}

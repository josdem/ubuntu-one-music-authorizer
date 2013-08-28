package com.talentua.jersey.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Path("/post")
public class PostController {
	
	private Log log = LogFactory.getLog(getClass());

	@POST
	@Path("/multi")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void post(MultivaluedMap<String, String> formParams) {
		for(String key : formParams.keySet()){
			log.info("key: " + key);
			log.info("value: " + formParams.get(key).get(0));
		}
	}
	
	@POST
	@Path("/user")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void post(@FormParam("firstname") final String firstname, @FormParam("lastname") final String lastname) {
		log.info("firstname: " + firstname + " lastname: " + lastname);
	}

}

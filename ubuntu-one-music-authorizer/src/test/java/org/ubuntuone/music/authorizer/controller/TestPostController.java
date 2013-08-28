package org.ubuntuone.music.authorizer.controller;

import javax.ws.rs.core.MultivaluedMap;

import org.junit.Test;
import org.ubuntuone.music.authorizer.controller.PostController;

import com.sun.jersey.core.util.MultivaluedMapImpl;

public class TestPostController {
	
	private PostController postController = new PostController();
	
	private MultivaluedMap<String, String> formParams = new MultivaluedMapImpl();
	private String firstname = "Jose Luis";
	private String lastname = "De la Cruz";
	
	@Test
	public void shouldPrintFirstNameAndLastName() throws Exception {
		postController.post(firstname, lastname);
	}
	
	@Test
	public void shouldPostFormParams() throws Exception {
		formParams.add("fisrtname", firstname);
		formParams.add("lastname", lastname);
		
		postController.post(formParams);
	}

}

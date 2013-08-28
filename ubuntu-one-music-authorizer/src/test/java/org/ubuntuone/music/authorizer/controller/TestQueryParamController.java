package org.ubuntuone.music.authorizer.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.ubuntuone.music.authorizer.controller.QueryParamController;
import org.ubuntuone.music.authorizer.model.Usuarios;
import org.ubuntuone.music.authorizer.service.UserService;


public class TestQueryParamController {
	
	@InjectMocks
	private QueryParamController queryParamController = new QueryParamController();
	
	@Mock
	private UserService userService;
	@Mock
	private Usuarios user;
	
	private int userId = 1;
	
	@Before
    public void setup() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

	@Test
	public void shouldGetQuery() throws Exception {
		when(userService.getUser(userId)).thenReturn(user);
		
		assertEquals(user, queryParamController.getQuery(userId));
	}
}

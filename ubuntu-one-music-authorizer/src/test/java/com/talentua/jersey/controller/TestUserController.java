package com.talentua.jersey.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.talentua.jersey.model.Usuarios;
import com.talentua.jersey.service.UserService;

public class TestUserController {

	@InjectMocks
    private UserController userController = new UserController();
    
    @Mock
    private UserService userService;
    @Mock
    private Usuarios user;
    @Mock
    private List<Usuarios> users;

	private Integer userId = 0;
    
    @Before
    public void setup() throws Exception {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void shouldGetUser() throws Exception {
        when(userService.getUser(userId)).thenReturn(user);
        assertEquals(user, userController.getUser(userId));
    }
    
    @Test
	public void shouldListUsers() throws Exception {
    	when(userService.getUsers()).thenReturn(users);
    	
		assertEquals(users, userController.getUsers());
	}

}

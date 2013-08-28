package com.talentua.jersey.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.talentua.jersey.dao.UserDao;
import com.talentua.jersey.model.Usuarios;

public class TestUserService {

	@InjectMocks
    private UserService userService;
    
    @Mock
    private UserDao userDao;
    @Mock
    private Usuarios user;
    
    private Integer userId = 0;
    private List<Usuarios> users = new ArrayList<Usuarios>();
    
    @Before
    public void setup() throws Exception {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void shouldGetFirstUser() throws Exception {
        users.add(user);
        when(userDao.findUsers()).thenReturn(users);
        
        assertEquals(user, userService.getUser(userId));
    }
    
    @Test
	public void shouldListUsers() throws Exception {
		when(userDao.findUsers()).thenReturn(users);
		
		assertEquals(users, userService.getUsers());
	}

}

package org.ubuntuone.music.authorizer.dao;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.ubuntuone.music.authorizer.dao.UserDao;
import org.ubuntuone.music.authorizer.model.Usuarios;


public class TestUserDao {

	private static final String USERS_QUERY = "Select u FROM Usuarios u";
    
    @InjectMocks
    private UserDao userDao = new UserDao();
    
    @Mock
    private EntityManager entityManager;
    @Mock
    private Query query;
    @Mock
    private Usuarios user;
    
    private List<Usuarios> users = new ArrayList<Usuarios>();
   
    @Before
    public void setup() throws Exception {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void shouldGetUsers() throws Exception {
        users.add(user);
        when(entityManager.createQuery(USERS_QUERY)).thenReturn(query);
        when(query.getResultList()).thenReturn(users);
        
        assertEquals(1, userDao.findUsers().size());
        assertEquals(user, userDao.findUsers().get(0));
    }

}

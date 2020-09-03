/*
package com.skidchenko.DAOLayer.DAOEntities;

import com.skidchenko.DAOLayer.DAOConfig.SpringConfig;
import com.skidchenko.DAOLayer.DAOExceptions.PersistException;
import com.skidchenko.entities.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.Assert.*;


class UserDAOTest {

    private static User testUser = new User();
    private static int createdId;

    private UserDAO dao;


    @BeforeEach
    void setUp() {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        dao = context.getBean("userDAO",UserDAO.class);

        testUser.setName("testUser1");
        testUser.setSurname("testUser1");
        testUser.setNickname("testUser1");
        testUser.setEmail("testUser1@org.com");
        testUser.setPassword("testUser1");
        testUser.setRole("testRole1");
    }

    @Test
    void read() throws PersistException {
        User expected = new User();
        expected.setId(1);
        expected.setName("testUser");
        expected.setSurname("testUser");
        expected.setNickname("testUser");
        expected.setEmail("testUser@org.com");
        expected.setPassword("testUser");
        expected.setRole("testRole");
        User actual = dao.read(1);
        testUser = actual;
        assertEquals(expected, actual);

    }

    @Test
    void create() throws PersistException {
        User user = testUser;

        createdId = (int) dao.create(user).getId();
        assertNotEquals(0, createdId);
    }
    @Test
    void delete() throws PersistException {

        int oldsize = dao.readAll().size();

        assertTrue(dao.delete(createdId));

        int newSize = dao.readAll().size();
        assertEquals(1, oldsize - newSize);

    }

    @Test
    void readAll() throws PersistException {

        List<User> list = dao.readAll();
        int size = list.size();
        assertTrue(size >= 1);
    }



    @Test
    void update() throws PersistException {
        User user3 = new User();
        user3.setName("testUser1");
        user3.setSurname("testUser1");
        user3.setNickname("testUser1");
        user3.setEmail("testUser1@org.com");
        user3.setPassword("testUser1");
        user3.setRole("testRole1");

        User testUser2 =  dao.create(user3);
        testUser2.setName("testUserChanged");
        dao.update(testUser2);
        assertEquals(dao.read((int) testUser2.getId()),testUser2);
        assertTrue(dao.delete((int) testUser2.getId()));

    }


}*/

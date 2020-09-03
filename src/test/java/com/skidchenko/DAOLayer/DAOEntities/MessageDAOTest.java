/*
package com.skidchenko.DAOLayer.DAOEntities;

import com.skidchenko.DAOLayer.DAOConfig.SpringConfig;
import com.skidchenko.DAOLayer.DAOExceptions.PersistException;
import com.skidchenko.entities.Message;
import com.skidchenko.entities.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.Assert.*;

class MessageDAOTest {

    static private MessageDAO dao;
    static private UserDAO userDao;
    static private Message testMessage = new Message();
    static private Message testMessage2 = new Message();
    private static int createdId;
    static private User testMessageUser;


    @BeforeAll
    static void beforeAll() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        dao = context.getBean("messageDAO", MessageDAO.class);
        userDao = context.getBean("userDAO", UserDAO.class);
        try {
            Calendar calendar = new GregorianCalendar(1998, Calendar.MAY, 5);
            testMessage.setDate(calendar.getTime());
            testMessage.setTitle("test Title");
            testMessage.setMessage("test message text");
            testMessage.setSendToId(2);
            testMessage.setUserId(1);
            testMessage2.setDate(calendar.getTime());
            testMessage2.setTitle("test Title");
            testMessage2.setMessage("test message text");
            testMessage2.setSendToId(2);
            testMessage2.setUserId(1);

            testMessageUser = userDao.read(1);
        } catch (PersistException e) {
            e.printStackTrace();
        }
    }

    @Test
    void create() {
        try {
            createdId = dao.create(testMessage).getMessageId();
        } catch (PersistException e) {
            e.printStackTrace();
        }
        assertNotEquals(0, createdId);
    }

    @Test
    void read() throws PersistException {
        Message actual = dao.read(1);
testMessage2.setMessageId(1);
        Message expected = testMessage2;
        assertEquals(expected, actual);
    }

    @Test
    void delete() throws PersistException {

        int oldsize = dao.readAllUserMessages(testMessageUser).size();

        assertTrue(dao.delete(createdId));

        int newSize = dao.readAllUserMessages(testMessageUser).size();
        assertEquals(1, oldsize - newSize);
    }

    @Test
    void readAllUserMessages() throws PersistException {
        List<Message> list = dao.readAllUserMessages(testMessageUser);
        int size = list.size();
        assertTrue(size >= 1);
    }
}*/

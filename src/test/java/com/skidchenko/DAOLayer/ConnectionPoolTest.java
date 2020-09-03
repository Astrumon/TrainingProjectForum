/*
package com.skidchenko.DAOLayer;


import com.skidchenko.DAOLayer.ConnectionSources.ConnectionPool;
import com.skidchenko.DAOLayer.ConnectionSources.ConnectionSource;
import com.skidchenko.DAOLayer.DAOClasses.DAOFactory;
import com.skidchenko.DAOLayer.DAOEntities.UserDAO;
import com.skidchenko.DAOLayer.DAOExceptions.PersistException;
import com.skidchenko.entities.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

class ConnectionPoolTest {
    @Test
    void getConnection() throws PersistException, SQLException {

        ConnectionSource connectionSource = new ConnectionPool();
        try (Connection connection = connectionSource.getConnection();
        ) {
            DAOFactory daoFactory = new DAOFactory();
            UserDAO dao = (UserDAO) daoFactory.getDao(User.class);
            Assert.assertNotNull("Connection is null!",connection);


            User testUser = new User();
            testUser.setName("testUser1");
            testUser.setSurname("testUser1");
            testUser.setNickname("testUser1");
            testUser.setEmail("testUser1@org.com");
            testUser.setPassword("testUser1");
            dao.create(testUser);

            Assert.assertNotEquals(0, testUser.getId());

        }

    }
}*/

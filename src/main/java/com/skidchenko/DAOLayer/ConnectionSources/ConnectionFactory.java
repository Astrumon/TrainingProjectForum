package com.skidchenko.DAOLayer.ConnectionSources;

import com.skidchenko.DAOLayer.DAOExceptions.PersistException;
import com.skidchenko.DAOLayer.ReadingProperties;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory implements ConnectionSource{

    public Connection getConnection() throws PersistException {
        Connection connection;
        try {
        Properties prop = ReadingProperties.getInstance().getPropValues();
        String url = "jdbc:postgresql://localhost:" + prop.getProperty("portNumber") + "/" + prop.getProperty("databaseName");
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, prop.getProperty("username"),prop.getProperty("password"));
        } catch (SQLException | IOException e) {
            throw new PersistException("Exception during receiving connection!",e);
        } catch (ClassNotFoundException e) {
            throw new PersistException("Driver class not found!", e);
        }
        return connection;


    }

}




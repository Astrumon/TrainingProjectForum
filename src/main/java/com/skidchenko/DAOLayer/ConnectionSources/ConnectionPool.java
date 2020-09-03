package com.skidchenko.DAOLayer.ConnectionSources;

import com.skidchenko.DAOLayer.DAOExceptions.PersistException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool implements ConnectionSource {
    public Connection getConnection() throws PersistException {
        Context ctx;
        Connection c = null;
        try {
            ctx = new InitialContext();
            System.setProperty(Context.INITIAL_CONTEXT_FACTORY,
                    "org.apache.naming.java.javaURLContextFactory");
            DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/Pool");
            c = ds.getConnection();
        } catch (NamingException | SQLException throwables) {
            throw new PersistException();
        }
        return c;
    }

}

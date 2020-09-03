//package com.skidchenko.DAOLayer.ConnectionSources;
//
//import com.skidchenko.DAOLayer.DAOExceptions.PersistException;
//import org.postgresql.xa.PGXADataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//@Component
//public class ConnectionFromDataSource implements ConnectionSource {
//
//    private DataSource dataSource;
//
//    @Autowired
//    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//
//    @Override
//    public Connection getConnection() throws PersistException {
//        try {
//            dataSource.getConnection();
//            System.out.println(dataSource.getPortNumbers());
//            System.out.println(dataSource.getURL());
//        } catch (SQLException e) {
//            throw new PersistException("Error while receiving connection from data source", e);
//        }
//
//
//        return null;
//    }
//}

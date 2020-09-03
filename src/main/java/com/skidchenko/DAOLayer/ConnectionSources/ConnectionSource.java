package com.skidchenko.DAOLayer.ConnectionSources;

import com.skidchenko.DAOLayer.DAOExceptions.PersistException;

import java.sql.Connection;

public interface ConnectionSource {
    Connection getConnection() throws PersistException;
}

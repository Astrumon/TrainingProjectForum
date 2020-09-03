/*
package com.skidchenko.DAOLayer.DAOClasses;

import com.skidchenko.DAOLayer.ConnectionSources.ConnectionFactory;
import com.skidchenko.DAOLayer.ConnectionSources.ConnectionSource;
import com.skidchenko.DAOLayer.DAOExceptions.PersistException;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDAO<Entity> implements GenericDAO<Entity> {

    protected abstract PreparedStatement setCreateStatement(Entity entity, Connection connection) throws PersistException, SQLException;

    protected abstract PreparedStatement setReadStatement(int id, Connection connection) throws PersistException;

    protected abstract PreparedStatement setReadAllStatement(Connection connection) throws PersistException;

    protected abstract PreparedStatement setDeleteStatement(int id, Connection connection) throws PersistException;

    protected abstract PreparedStatement setUpdateStatement(Entity entity, Connection connection) throws PersistException;

    protected abstract void setId(int id, Entity entity) throws PersistException;

    protected abstract Entity getEntity(ResultSet resultSet) throws SQLException, PersistException;


    protected ConnectionSource connectionSource;

    @Autowired
    public void setConnectionSource (ConnectionSource connectionSource) {
        this.connectionSource = new ConnectionFactory();
    }

    @Override
    public Entity create(Entity entity) throws PersistException {

        try (Connection connection = connectionSource.getConnection();
             PreparedStatement preparedStatement = setCreateStatement(entity, connection)) {
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();
            int id = resultSet.getInt(1);
            setId(id, entity);
        } catch (SQLException e) {
            throw new PersistException(e);
        }
        return entity;

    }

    @Override
    public List<Entity> readAll() throws PersistException {
        List<Entity> list = new ArrayList<Entity>();

        try (Connection connection = connectionSource.getConnection();
             PreparedStatement preparedStatement = setReadAllStatement(connection);) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Entity entity = getEntity(resultSet);
                list.add(entity);
            }
        } catch (SQLException e) {
            throw new PersistException(e);
        }
        return list;
    }

    @Override
    public Entity read(int id) throws PersistException {

        Entity entity = null;
        try (Connection connection = connectionSource.getConnection();
             PreparedStatement preparedStatement = setReadStatement(id, connection);) {
            ResultSet resultSet = preparedStatement.executeQuery();
            //if (resultSet.row) return null;
            resultSet.next();
            entity = getEntity(resultSet);
        } catch (SQLException e) {
            throw new PersistException(e);
        }
        return entity;
    }

    @Override
    public boolean update(Entity entity) throws PersistException {

        try {
            try (Connection connection = connectionSource.getConnection();
                 PreparedStatement preparedStatement = setUpdateStatement(entity, connection)) {
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new PersistException(e);
        }
        return true;
    }

    @Override
    public boolean delete(int id) throws PersistException {
        if (id == 0) throw new PersistException("Invalid ID (equals to zero)!");
        try {
            try (Connection connection = connectionSource.getConnection();
                 PreparedStatement preparedStatement = setDeleteStatement(id, connection)) {
                int result = preparedStatement.executeUpdate();
                if (result != 1) throw new PersistException("Deleting resultSet doesn`t have 1 row!");
            }
        } catch (SQLException e) {
            throw new PersistException(e);
        }
        return true;
    }
}
*/

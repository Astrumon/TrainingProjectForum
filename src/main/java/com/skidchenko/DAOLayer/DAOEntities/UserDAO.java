/*
package com.skidchenko.DAOLayer.DAOEntities;

import com.skidchenko.DAOLayer.DAOClasses.AbstractDAO;
import com.skidchenko.DAOLayer.DAOExceptions.PersistException;
import com.skidchenko.entities.User;

import java.sql.*;

public class UserDAO extends AbstractDAO<User> {


    @Override
    protected PreparedStatement setCreateStatement(User entity, Connection connection) throws PersistException {
        String sql = "INSERT INTO USERS (nickname,name,surname,password,email,role) VALUES (?,?,?,?,?,?)";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, entity.getNickname());
            preparedStatement.setString(2, entity.getName());
            preparedStatement.setString(3, entity.getSurname());
            preparedStatement.setString(4, entity.getPassword());
            preparedStatement.setString(5, entity.getEmail());
            preparedStatement.setString(6, entity.getRole());
        } catch (SQLException e) {
            throw new PersistException(e);
        }
        return preparedStatement;
    }

    @Override
    protected PreparedStatement setReadStatement(int id, Connection connection) throws PersistException {
        String sql = "SELECT * FROM USERS WHERE (ID=?);";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
        } catch (SQLException e) {
            throw new PersistException(e);
        }
        return preparedStatement;
    }

    @Override
    protected PreparedStatement setReadAllStatement(Connection connection) throws PersistException {
        String sql = "SELECT * FROM USERS";
        try {
            return connection.prepareStatement(sql);
        } catch (SQLException e) {
            throw new PersistException(e);
        }
    }


    @Override
    protected PreparedStatement setDeleteStatement(int id, Connection connection) throws PersistException {
        String sql = "DELETE FROM USERS WHERE (ID=?)";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
        } catch (SQLException e) {
            throw new PersistException(e);
        }
        return preparedStatement;
    }

    @Override
    protected PreparedStatement setUpdateStatement(User entity, Connection connection) throws PersistException {
        String sql = "UPDATE USERS SET nickName=?,name=?,surname=?,password=?,email=?,role=? WHERE (id=?)";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, entity.getNickname());
            preparedStatement.setString(2, entity.getName());
            preparedStatement.setString(3, entity.getSurname());
            preparedStatement.setString(4, entity.getPassword());
            preparedStatement.setString(5, entity.getEmail());
            preparedStatement.setString(6, entity.getRole());
            preparedStatement.setInt(7, (int) entity.getId());
        } catch (SQLException e) {
            throw new PersistException(e);
        }
        return preparedStatement;
    }

    @Override
    protected void setId(int id, User entity) throws PersistException {
        entity.setId(id);
    }

    @Override
    protected User getEntity(ResultSet resultSet) throws PersistException {

        User user = new User();
       try {
            user.setId(resultSet.getInt("id"));
            user.setNickname(resultSet.getString("nickname"));
            user.setName(resultSet.getString("name"));
            user.setSurname(resultSet.getString("surname"));
            user.setEmail(resultSet.getString("email"));
            user.setPassword(resultSet.getString("password"));
            user.setName(resultSet.getString("name"));
            user.setRole(resultSet.getString("role"));
        } catch (SQLException e) {
           throw new PersistException(e);
       }
        return user;
    }


}
*/

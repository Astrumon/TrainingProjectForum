/*
package com.skidchenko.DAOLayer.DAOEntities;

import com.skidchenko.DAOLayer.DAOClasses.AbstractDAO;
import com.skidchenko.DAOLayer.DAOExceptions.PersistException;
import com.skidchenko.entities.Message;
import com.skidchenko.entities.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MessageDAO extends AbstractDAO<Message> {
    @Override
    protected PreparedStatement setCreateStatement(Message entity, Connection connection) throws PersistException {
        String sql =
                "INSERT INTO MESSAGES (userid, title, message, date, sendtoid) VALUES (?,?,?,?,?)";
        PreparedStatement preparedStatement;

        try {
            preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, entity.getUserId());
            preparedStatement.setString(2, entity.getTitle());
            preparedStatement.setString(3, entity.getMessage());
            java.sql.Date sqlDate = new Date(entity.getDate().getTime());
            preparedStatement.setDate(4, sqlDate);
            preparedStatement.setInt(5, entity.getSendToId());
            return preparedStatement;
        } catch (SQLException e) {
            throw new PersistException(e);
        }
    }

    @Override
    protected PreparedStatement setReadStatement(int id, Connection connection) throws PersistException {
        String sql =
                "SELECT * FROM messages WHERE (messageid=?);";
        PreparedStatement preparedStatement;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            return preparedStatement;
        } catch (SQLException e) {
            throw new PersistException(e);
        }
    }

    @Override
    protected PreparedStatement setReadAllStatement(Connection connection) throws PersistException {
        throw new PersistException(" User can`t read all messages!");
    }

    @Override
    protected PreparedStatement setDeleteStatement(int id, Connection connection) throws PersistException {
        String sql = "DELETE FROM MESSAGES WHERE (messageId=?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            return preparedStatement;
        } catch (SQLException e) {
            throw new PersistException(e);
        }
    }

    @Override
    protected PreparedStatement setUpdateStatement(Message entity, Connection connection) throws PersistException {
        return null;
    }

    @Override
    protected void setId(int id, Message entity) throws PersistException {
        entity.setMessageId(id);
    }

    @Override
    protected Message getEntity(ResultSet resultSet) throws PersistException {
        try {
            Message message = new Message();
            message.setMessageId(resultSet.getInt("messageid"));
            message.setSendToId(resultSet.getInt("sendtoid"));
            message.setUserId(resultSet.getInt("userid"));
            message.setTitle(resultSet.getString("title"));
            message.setMessage(resultSet.getString("message"));
            message.setDate(resultSet.getDate("date"));
            return message;
        } catch (SQLException e) {
            throw new PersistException(e);
        }
    }

    @Override
    public boolean update(Message entity) throws PersistException {
        throw new PersistException("Can`t change existing message!");
    }

    public List <Message> readAllUserMessages(User user) throws PersistException {
        List<Message> list = new ArrayList<Message>();

        try (Connection connection = connectionSource.getConnection();
             PreparedStatement preparedStatement = setReadAllUserMessages(connection,user);) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Message message = getEntity(resultSet);
                list.add(message);
            }
        } catch (SQLException e) {
            throw new PersistException(e);
        }
        return list;
    }

    public PreparedStatement setReadAllUserMessages(Connection connection, User user) throws PersistException {
        String sql = "SELECT * FROM MESSAGES WHERE (userid=?)";
        PreparedStatement preparedStatement;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, (int) user.getId());
        } catch (SQLException e) {
            throw new PersistException(e);
        }

        return preparedStatement;
    }
}
*/

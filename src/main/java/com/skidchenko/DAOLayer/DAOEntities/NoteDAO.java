/*
package com.skidchenko.DAOLayer.DAOEntities;

import com.skidchenko.DAOLayer.DAOClasses.AbstractDAO;
import com.skidchenko.DAOLayer.DAOExceptions.PersistException;
import com.skidchenko.entities.Note;
import java.sql.Date;

import java.sql.*;

public class NoteDAO extends AbstractDAO<Note> {

    @Override
    protected PreparedStatement setCreateStatement(Note entity, Connection connection) throws PersistException {
        try {
            String sql = "INSERT INTO notes (userid, title, text, creationdate) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, entity.getUserId());
            preparedStatement.setString(2, entity.getTitle());
            preparedStatement.setString(3, entity.getText());
            java.sql.Date sqlDate = new Date(entity.getCreationDate().getTime());
            preparedStatement.setDate(4, sqlDate);
            return preparedStatement;
        } catch (SQLException e) {
            throw new PersistException(e);
        }
    }

    @Override
    protected PreparedStatement setReadStatement(int noteid, Connection connection) throws PersistException {
        String sql = "SELECT * FROM notes WHERE (noteid=?);";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, noteid);
        } catch (SQLException e) {
            throw new PersistException(e);
        }
        return preparedStatement;
    }

    @Override
    protected PreparedStatement setReadAllStatement(Connection connection) throws PersistException {
        String sql = "SELECT * FROM notes";
        try {
            return connection.prepareStatement(sql);
        } catch (SQLException e) {
            throw new PersistException(e);
        }
    }


    @Override
    protected PreparedStatement setDeleteStatement(int noteid, Connection connection) throws PersistException {
        String sql = "DELETE FROM NOTES WHERE (noteid=?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, noteid);
            return preparedStatement;
        } catch (SQLException e) {
            throw new PersistException(e);
        }
    }

    @Override
    protected PreparedStatement setUpdateStatement(Note entity, Connection connection) throws PersistException {
        String sql = "UPDATE NOTES SET userid=?,title=?,text=?,creationDate=? WHERE (noteid=?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, entity.getUserId());
            preparedStatement.setString(2, entity.getTitle());
            preparedStatement.setString(3, entity.getText());
            java.sql.Date sqlDate = new Date(entity.getCreationDate().getTime());
            preparedStatement.setDate(4, sqlDate);
            preparedStatement.setInt(5, entity.getNoteId());
            return preparedStatement;
        } catch (SQLException e) {
            throw new PersistException(e);
        }
    }

    @Override
    protected void setId(int id, Note entity) {
        entity.setNoteId(id);
    }

    @Override
    protected Note getEntity(ResultSet resultSet) throws PersistException {
        Note note = new Note();
        try {

            note.setUserId(resultSet.getInt("userId"));
            note.setNoteId(resultSet.getInt("noteId"));
            note.setTitle(resultSet.getString("title"));
            note.setText(resultSet.getString("text"));
            java.sql.Date sqlDate = resultSet.getDate("creationDate");
            note.setCreationDate(sqlDate);
        } catch (SQLException e) {
            throw new PersistException(e);
        }


        return note;
    }
}
*/

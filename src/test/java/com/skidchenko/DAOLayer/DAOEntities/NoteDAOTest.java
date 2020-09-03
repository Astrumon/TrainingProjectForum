/*
package com.skidchenko.DAOLayer.DAOEntities;

import com.skidchenko.DAOLayer.DAOConfig.SpringConfig;
import com.skidchenko.DAOLayer.DAOExceptions.PersistException;
import com.skidchenko.entities.Note;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.Assert.*;

class NoteDAOTest {

    private static Note testNote = new Note();
    private static int createdId;
    private NoteDAO dao;


    @BeforeEach
    void setUp() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        dao = context.getBean("noteDAO",NoteDAO.class);

        testNote.setTitle("test Title");
        testNote.setText("test text");
        testNote.setUserId(1);
        Calendar calendar = new GregorianCalendar(5, Calendar.MAY, 1998);
        testNote.setCreationDate(calendar.getTime());
    }

    @Test
    void create() throws PersistException {
        Note note = testNote;

        createdId = dao.create(note).getNoteId();
        assertNotEquals(0, createdId);
    }

    @Test
    void delete() throws PersistException {

        int oldsize = dao.readAll().size();

        assertTrue(dao.delete(createdId));

        int newSize = dao.readAll().size();
        assertEquals(1, oldsize - newSize);

    }

    @Test
    void readAll() throws PersistException {

        List<Note> list = dao.readAll();
        int size = list.size();
        assertTrue(size >= 1);
    }


    @Test
    void read() {

        Note expected = new Note();
        expected.setNoteId(1);
        expected.setUserId(1);
        expected.setText("test text");
        expected.setTitle("test Title");
        Calendar calendar = new GregorianCalendar(1998, Calendar.MAY, 5);
        expected.setCreationDate(calendar.getTime());

        try {
            Note actual = dao.read(1);
            assertEquals(expected, actual);
        } catch (PersistException throwables) {
            throwables.printStackTrace();
        }

    }

    @Test
    void update() throws PersistException {
        Note testNote2 = dao.create(testNote);
        testNote2.setText("changed text");
        dao.update(testNote2);
        assertEquals(dao.read(testNote2.getNoteId()), testNote2);
        assertTrue(dao.delete(testNote2.getNoteId()));

    }

}
*/

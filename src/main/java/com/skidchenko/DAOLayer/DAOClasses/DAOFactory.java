/*
package com.skidchenko.DAOLayer.DAOClasses;

import com.skidchenko.DAOLayer.DAOEntities.MessageDAO;
import com.skidchenko.DAOLayer.DAOEntities.NoteDAO;
import com.skidchenko.DAOLayer.DAOEntities.UserDAO;
import com.skidchenko.entities.Message;
import com.skidchenko.entities.Note;
import com.skidchenko.entities.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class DAOFactory {

    HashMap<Class,GenericDAO> creators;

    public DAOFactory() {
        creators = new HashMap<>();
        creators.put(User.class,new UserDAO());
        creators.put(Note.class,new NoteDAO());
        creators.put(Message.class,new MessageDAO());
    }
    public GenericDAO getDao (Class clazz) {
        return creators.get(clazz);

    }
}
*/

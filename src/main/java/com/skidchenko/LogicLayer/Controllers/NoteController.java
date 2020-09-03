package com.skidchenko.LogicLayer.Controllers;

import com.skidchenko.DAOLayer.SpringDataRepository.NotesRepository;
import com.skidchenko.entities.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class NoteController {


    @Autowired
    NotesRepository notesRepository;


    @RequestMapping(path = "NoteList",method = RequestMethod.GET)
    public ModelAndView messagesByUserId ( @RequestParam(value = "userId",required = false) Long userId) {
        ModelAndView modelAndView = new ModelAndView("NoteList");
        System.out.println(userId);
        if(userId!=null) {
            System.out.println(userId);
            List<Note> notes = notesRepository.findAllByUserId(userId);
            modelAndView.addObject("notesList",notes);
        }


        return modelAndView;
    }



}

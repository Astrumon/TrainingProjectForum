package com.skidchenko.LogicLayer.Controllers;

import com.skidchenko.DAOLayer.SpringDataRepository.MessagesRepository;
import com.skidchenko.DAOLayer.SpringDataRepository.UsersRepository;
import com.skidchenko.LogicLayer.Forms.MessageViewForm;
import com.skidchenko.entities.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MessageViewController {
    @Autowired
    MessagesRepository messagesRepository;

    @Autowired
    UsersRepository usersRepository;

    @RequestMapping(path = "/MessagesPage/chooseUser")
    public ModelAndView userMessagesPage(Model model) {
        MessageViewForm form = new MessageViewForm();
        model.addAttribute("messageViewForm", form);
        System.out.println("модель добавлена");
        ModelAndView modelAndView = new ModelAndView("MessagesPage", "model", model);
        System.out.println(modelAndView.getModel().get("model"));
        return new ModelAndView("MessagesPage");
    }


    @RequestMapping(path = "/MessagesPage/withForm", method = RequestMethod.POST)
    public ModelAndView showUsersMessages(
            @ModelAttribute("messageViewForm") MessageViewForm messageViewForm) {
        System.out.println(messageViewForm);
        ModelAndView modelAndView = new ModelAndView("MessagesPage");
        if (messageViewForm != null) {
            List<Message> messages = new ArrayList<>();
            String userName = "";
            String userNameFrom = "";
            String userNameTo = "";
            switch (messageViewForm.getMessageType()) {
                case ("ALL"):
                    messages = messagesRepository.findAllByUserId(messageViewForm.getUserId());
                    messages.addAll(messagesRepository.findAllBySendToId(messageViewForm.getUserId()));
                    for (Message message: messages
                    ) {
                        message.setTo(usersRepository.findAllById(message.getUserId()).getNickname());
                        message.setFrom(usersRepository.findAllById(message.getSendToId()).getNickname());
                    }
                case ("SENT"):
                    messages = messagesRepository.findAllByUserId(messageViewForm.getUserId());
                    for (Message message: messages
                    ) {
                        message.setTo(usersRepository.findAllById(message.getUserId()).getNickname());
                        message.setFrom(usersRepository.findAllById(message.getSendToId()).getNickname());
                    }
                    break;
                case ("RECEIVED"):
                    messages = messagesRepository.findAllBySendToId(messageViewForm.getUserId());
                    for (Message message: messages
                         ) {
                        message.setTo(usersRepository.findAllById(message.getUserId()).getNickname());
                        message.setFrom(usersRepository.findAllById(message.getSendToId()).getNickname());
                    }
                    break;
            }
            System.out.println("!!!" + messages);
            modelAndView.addObject("messages", messages);
            modelAndView.addObject("messagesType", messageViewForm.getMessageType());
            modelAndView.addObject("userName", userName);
        }

        return modelAndView;
    }
}

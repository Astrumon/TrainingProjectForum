package com.skidchenko.LogicLayer.Controllers;


import com.skidchenko.DAOLayer.SpringDataRepository.UsersRepository;
import com.skidchenko.LogicLayer.Forms.UserForm;
import com.skidchenko.entities.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController  {

@Autowired
    private UsersRepository usersRepository;


    @RequestMapping(path = "/UserRegisterForm", method = RequestMethod.GET)
    public ModelAndView usersList(@NotNull javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {

        List<User> users = usersRepository.findAll();
        for (User user :users
             ) {
            System.out.println(user);
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("UserRegister");
        modelAndView.addObject("UsersFromServer", users);
        System.out.println(users);
        return modelAndView;
    }



    @RequestMapping(path = "/UserRegisterForm/SignIn", method = RequestMethod.POST)
    public String addUser(UserForm userForm) {
        User newUser = User.from(userForm);

        System.out.println(userForm);
        System.out.println(newUser.getFirstName() + newUser.getLastName());
        usersRepository.save(newUser);
        return "redirect:/UserRegisterForm";
    }

}

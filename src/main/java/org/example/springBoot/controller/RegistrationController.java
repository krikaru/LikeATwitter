package org.example.springBoot.controller;

import org.example.springBoot.domain.Role;
import org.example.springBoot.domain.User;
import org.example.springBoot.repos.UserRepo;
import org.example.springBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {
    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Map<String, Object> model){


        if (!userService.addUser(user)){
            model.put("message", "User exists!");
            return "registration";
        }


        return "redirect:/login";
    }
}

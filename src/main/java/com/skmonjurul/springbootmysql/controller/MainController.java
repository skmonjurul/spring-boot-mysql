package com.skmonjurul.springbootmysql.controller;

import com.skmonjurul.springbootmysql.model.User;
import com.skmonjurul.springbootmysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/demo")
public class MainController {

    @Autowired
    private UserRepository userRepository;


    @PostMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);

        userRepository.save(user);

        return "Saved";
    }

    @GetMapping(path = "/get")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}

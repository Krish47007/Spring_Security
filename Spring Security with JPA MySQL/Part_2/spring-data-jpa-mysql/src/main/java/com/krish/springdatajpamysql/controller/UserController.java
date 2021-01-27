package com.krish.springdatajpamysql.controller;

import com.krish.springdatajpamysql.models.User;
import com.krish.springdatajpamysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/test")
    @ResponseBody public String greet()
    {
        return "Hi!!!";
    }

    @PostMapping("/add")
    public @ResponseBody String addNewUser(@RequestParam String name,@RequestParam String email)
    {
        User user = new User();
        user.setName(name);
        user.setEmail(email);

        //saving
        userRepository.save(user);

        return "User Info Saved successfully!!!!";
    }

}

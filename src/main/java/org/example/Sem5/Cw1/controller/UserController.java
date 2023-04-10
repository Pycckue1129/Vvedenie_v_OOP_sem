package org.example.Sem5.Cw1.controller;

import org.example.Sem5.Cw1.model.User;
import org.example.Sem5.Cw1.service.UserService;

public class UserController {
   private UserService userService = new UserService();
    public void saveNewUser(String name, int age){
        userService.saveUser(new User(name, age));


    }
}

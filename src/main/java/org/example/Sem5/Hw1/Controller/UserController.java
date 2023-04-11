package org.example.Sem5.Hw1.Controller;

import org.example.Sem5.Hw1.Model.User;
import org.example.Sem5.Hw1.Service.EditBalanceUserService;
import org.example.Sem5.Hw1.Service.EditDbUserService;

public class UserController {
    private final EditDbUserService editDbUserService = new EditDbUserService();
    private final EditBalanceUserService editBalanceUserService = new EditBalanceUserService();

    public void deleteUser(User user){
        editDbUserService.deleteUser(user);
    }

    public User getUser(User user){
        return editDbUserService.getUser(user);
    }

    public void saveUser(User user){
        editDbUserService.saveUser(user);
    }

    public void getBalance(User user){
        editBalanceUserService.getBalance(user);
    }

    public void setBalance(int balance, User user){
        editBalanceUserService.setBalance(balance, user);
    }
}
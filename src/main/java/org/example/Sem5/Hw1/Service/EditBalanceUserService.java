package org.example.Sem5.Hw1.Service;

import org.example.Sem5.Hw1.Model.User;

public class EditBalanceUserService {
    User user = new User();

    public void getBalance(User user){
        System.out.println(user.getBalance());
    }

    public void setBalance(int balance, User user){
        user.setBalance(balance);
    }
}

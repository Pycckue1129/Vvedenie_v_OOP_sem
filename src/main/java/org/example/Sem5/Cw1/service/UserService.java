package org.example.Sem5.Cw1.service;

import org.example.Sem5.Cw1.model.User;
import org.example.Sem5.Cw1.repo.UserRepo;

public class UserService {
    private UserRepo userRepo = new UserRepo();
    public void saveUser(User user){
        userRepo.saveUser(user);
    }

}

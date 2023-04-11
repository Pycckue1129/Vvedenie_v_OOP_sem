package org.example.Sem5.Hw1.Service;

import org.example.Sem5.Hw1.Repo.UserRepo;
import org.example.Sem5.Hw1.Model.User;

public class EditDbUserService {
    UserRepo userRepo = new UserRepo();

    public void saveUser(User user){
        userRepo.addUser(user);
    }

    public void deleteUser(User user){
        userRepo.deleteUser(user);
    }

    public User getUser(User user){
        return userRepo.getUser(user);
    }
}

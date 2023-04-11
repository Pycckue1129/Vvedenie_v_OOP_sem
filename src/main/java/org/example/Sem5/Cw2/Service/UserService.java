package org.example.Sem5.Cw2.Service;

import org.example.Sem5.Cw2.Model.User;
import org.example.Sem5.Cw2.Repo.UserRepo;

public class UserService {
    private UserRepo userRepo = new UserRepo();
    public void saveUser(User user){
        userRepo.saveUser(user);
    }

    public void deleteFromRepo(User user){
        userRepo.deleteFromRepo(user);
    }

    public User getUserFromRepo(User user){
        return userRepo.getUserFromRepo(user);
    }

    public void addUserToRepo(User user){
        userRepo.addUserToRepo(user);
    }

}

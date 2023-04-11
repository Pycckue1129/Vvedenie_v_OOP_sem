package org.example.Sem5.Hw1.Repo;

import org.example.Sem5.Hw1.Model.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private List<User> db = new ArrayList<>();

    public UserRepo(List<User> db) {
        this.db = db;
    }

    public UserRepo() {
    }

    public void addUser(User user){
        db.add(user);
    }

    public  void deleteUser(User user){
        db.remove(user);
    }

    public User getUser(User user){
        for(User el: db){
            if (el.getIdUser().equals(user.getIdUser())){
                return el;
            }
        }
        return null;
    }
}

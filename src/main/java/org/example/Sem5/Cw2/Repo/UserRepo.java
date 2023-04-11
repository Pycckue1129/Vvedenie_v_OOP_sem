package org.example.Sem5.Cw2.Repo;

import org.example.Sem5.Cw2.Model.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {

    private List<User> db = new ArrayList<>();

    public UserRepo(List<User> db) {
        this.db = new ArrayList<>();
    }

    public UserRepo() {
    }

    public void addUserToRepo(User user) {
        db.add(user);
    }

    public void deleteFromRepo(User user) {
        db.remove(user);
    }

    public User getUserFromRepo(User user) {
        for (User el : db){
            if (el.getUserId().equals(user.getUserId())){
                return el;
            }
        }
        return null;
    }

    public void saveUser(User user){
        try(FileWriter fileWriter = new FileWriter("text.txt", true)){
            fileWriter.write(user.toString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

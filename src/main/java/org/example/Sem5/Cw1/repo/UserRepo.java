package org.example.Sem5.Cw1.repo;

import org.example.Sem5.Cw1.model.User;

import java.io.FileWriter;

public class UserRepo {
    public void saveUser(User user){
        try(FileWriter fileWriter = new FileWriter("text.txt", true)){
            fileWriter.write(user.toString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

package org.example.Sem5.Cw2.Controller;

import org.example.Sem5.Cw2.Model.User;
import org.example.Sem5.Cw2.Service.UserService;

public class UserController {
   private UserService userService = new UserService();
        public void saveNewUser(int userID, String name, int age){
            userService.saveUser(new User(userID, name, age));
        }

        public void deleteUser(User user){
            userService.deleteFromRepo(user);
        }

        public User getUser(User user){
            return userService.getUserFromRepo(user);
        }

        public void addUserToRepo(User user){
            userService.addUserToRepo(user);
        }
}

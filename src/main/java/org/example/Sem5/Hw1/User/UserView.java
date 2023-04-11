package org.example.Sem5.Hw1.User;

import org.example.Sem5.Hw1.Controller.UserController;
import org.example.Sem5.Hw1.Model.User;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        User user1 = new User(0,"name1",10500);
        User user2 = new User(1,"name2",25000);
        userController.saveUser(user1);
        userController.saveUser(user2);
        System.out.println(userController.getUser(user1));
        userController.setBalance(500, user1);
        System.out.println(userController.getUser(user1));
        System.out.println("------------------------------------------------");
        System.out.println(userController.getUser(user2));
        userController.setBalance(6000, user2);
        System.out.println(userController.getUser(user2));
    }
}

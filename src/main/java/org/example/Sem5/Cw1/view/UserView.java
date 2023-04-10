package org.example.Sem5.Cw1.view;

import org.example.Sem5.Cw1.controller.UserController;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter ur data");
        userController.saveNewUser(scanner.nextLine(),scanner.nextInt());

    }
}

package org.example.Sem5.Hw1.Model;

public class User {
    Integer idUser;
    String name;
    int balance;

    public User() {

    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public User(int idUser, String name, int balance) {
        this.idUser = idUser;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

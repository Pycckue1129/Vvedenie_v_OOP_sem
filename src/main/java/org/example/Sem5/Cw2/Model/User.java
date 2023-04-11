package org.example.Sem5.Cw2.Model;

public class User {
    private Integer userID;
    private String name;
    private int age;

    public User(Integer userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getUserId() {
        return userID;
    }

    public void setUserId(Integer userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

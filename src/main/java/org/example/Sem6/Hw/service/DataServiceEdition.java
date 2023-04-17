package org.example.Sem6.Hw.service;

import org.example.Sem6.Hw.data.Student;
import org.example.Sem6.Hw.data.User;

import java.util.ArrayList;
import java.util.List;

public class DataServiceEdition {

    private List<User> users1;

    public DataServiceEdition() {
        this.users1 = new ArrayList<>();
    }

    public DataServiceEdition(List<User> users1) {
        this.users1 = users1;
    }

    public List<User> getAll(){
        return this.users1;
    }

    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        Long countMaxId = 0L;
        for (User user: this.users1){
            if(user instanceof Student){
                if (((Student) user).getStudentId() > countMaxId){
                    countMaxId = ((Student) user).getStudentId();
                }
            }
        }
        countMaxId++;

        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        this.users1.add(student);
    }
    public void printList(){
        for (User user: this.users1){
            System.out.println(user);
        }
    }

}

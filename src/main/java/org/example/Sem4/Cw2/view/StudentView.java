package org.example.Sem4.Cw2.view;

import org.example.Sem4.Cw2.data.Student;
import org.example.Sem4.Cw2.data.StudentGroup;
import org.example.Sem4.Cw2.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student>{
    Logger logger = Logger.getLogger(UserView.class.getName());

    public Student sendOnConsole(List<User> userList){
        return (Student) userList.get(0);
    }
}

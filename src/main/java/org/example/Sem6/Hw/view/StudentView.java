package org.example.Sem6.Hw.view;

import org.example.Sem6.Hw.data.Student;
import org.example.Sem6.Hw.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student> {
    Logger logger = Logger.getLogger(UserView.class.getName());

    public Student sendOnConsole(List<User> userList){
        return (Student) userList.get(0);
    }
}

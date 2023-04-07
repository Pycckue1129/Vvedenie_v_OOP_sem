package org.example.Sem4.Hw.view;

import org.example.Sem4.Hw.data.Teacher;
import org.example.Sem4.Hw.data.User;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher>{
    Logger logger = Logger.getLogger(UserView.class.getName());

    public Teacher sendOnConsole(List<User> userList){
        return (Teacher) userList.get(0);
    }
}

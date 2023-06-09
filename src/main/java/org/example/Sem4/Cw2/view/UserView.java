package org.example.Sem4.Cw2.view;

import org.example.Sem4.Cw2.data.Student;
import org.example.Sem4.Cw2.data.StudentGroup;
import org.example.Sem4.Cw2.data.User;

import java.util.List;
import java.util.logging.Logger;

public interface UserView<T extends User> {

    public T sendOnConsole(List<User> userList);

}

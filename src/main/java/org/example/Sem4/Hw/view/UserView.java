package org.example.Sem4.Hw.view;

import org.example.Sem4.Hw.data.User;

import java.util.List;

public interface UserView<T extends User> {

    public T sendOnConsole(List<User> userList);

}

package org.example.Sem6.Hw.view;

import org.example.Sem6.Hw.data.User;

import java.util.List;

public interface UserView<T extends User> {

    public T sendOnConsole(List<User> userList);

}

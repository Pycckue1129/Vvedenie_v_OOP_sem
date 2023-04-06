package org.example.Sem4.Cw2;

import org.example.Sem4.Cw2.data.Teacher;
import org.example.Sem4.Cw2.data.UserComparator;

public class Main {
    public static void main(String[] args) {
        Teacher teat1 = new Teacher("teacher1","teacher2","teacher1","date1");
        Teacher teat2 = new Teacher("teacher1","teacher1","teacher1","date1");
        UserComparator<Teacher> comp = new UserComparator<>();
        System.out.println(comp.compare(teat1,teat2));
    }
}

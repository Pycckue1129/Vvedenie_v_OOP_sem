package org.example.Sem6.Hw;

import org.example.Sem6.Hw.data.Student;
import org.example.Sem6.Hw.data.Teacher;
import org.example.Sem6.Hw.data.UserComparator;
import org.example.Sem6.Hw.view.StudentView;

import java.util.List;

//- Модифицировать ранее созданный класс ЮзерВью
//        - Сделать его интерфейсом
//        - Типизировать его T наследующегося от типа Юзер
//        - Внести в метод sendOnConsole типизацию
//        - Создать класс СтудентВью реализующий созданный интерфейс
//        - Внести правки в метод sendOnConsole согласно типизации
//        - Перенести в него ранее созданные другие методы(включая те,
//        которые могли быть созданы в процессе домашней работы)

public class Main {
    public static void main(String[] args) {
        Teacher teat1 = new Teacher("teacher1","teacher2","teacher1","date1");
        Teacher teat2 = new Teacher("teacher1","teacher1","teacher1","date1");
        UserComparator<Teacher> comp = new UserComparator<>();
        System.out.println(comp.compare(teat1,teat2));

        StudentView studentView1 = new StudentView();
        System.out.println(studentView1.sendOnConsole(List.of(new Student("FirstName",
                "SecondName", "Patronymic", "21222022"))));
    }
}

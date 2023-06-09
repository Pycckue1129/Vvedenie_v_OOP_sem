package org.example.Sem6.Hw;

import org.example.Sem6.Hw.data.Student;
import org.example.Sem6.Hw.data.Teacher;
import org.example.Sem6.Hw.data.UserComparator;
import org.example.Sem6.Hw.service.DataServiceEdition;
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

        DataServiceEdition dataServiceEdition = new DataServiceEdition();
        dataServiceEdition.create("Name1", "secondName1", "Patronymic1", "22.09.1992");
        dataServiceEdition.create("Name2", "secondName2", "Patronymic2", "23.10.1993");
        dataServiceEdition.create("Name3", "secondName3", "Patronymic3", "24.11.1994");
        dataServiceEdition.create("Name4", "secondName4", "Patronymic4", "25.12.1995");

        dataServiceEdition.printList();
    }
}

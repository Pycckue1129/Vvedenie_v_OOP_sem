package org.example.Sem4.Hw.controller;

import org.example.Sem4.Hw.data.Student;
import org.example.Sem4.Hw.data.Teacher;
import org.example.Sem4.Hw.data.User;
import org.example.Sem4.Hw.service.DataService;
import org.example.Sem4.Hw.service.StudentGroupService;
import org.example.Sem4.Hw.view.StudentView;

import java.util.List;

public class  UserController {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView userView = new StudentView();

    public void createStudent(String firstName, String secondName, String patronymic, String dateOfBirth){
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }
}

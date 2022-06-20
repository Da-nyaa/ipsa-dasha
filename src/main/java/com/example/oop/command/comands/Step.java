package com.example.oop.command.comands;

import com.example.oop.command.Command;
import com.example.oop.manager.Manager;
import com.example.oop.model.Student;

public class Step implements Command {
    @Override
    public void execute() {
        Student student = Student.getInstance();
        student.setPoints(0);
        student.setMoralEndurance(0);
        student.setCash(-999999);
        Manager.getInstance().saveData(student);
        System.out.println(Student.getInstance().toString());
        System.out.println("Step");
    }
}

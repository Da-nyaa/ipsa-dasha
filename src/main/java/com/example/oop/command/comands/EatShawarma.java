package com.example.oop.command.comands;

import com.example.oop.command.Command;
import com.example.oop.manager.Manager;
import com.example.oop.model.Student;

public class EatShawarma implements Command {
    @Override
    public void execute() {
        Student student = Student.getInstance();
        student.setPoints(student.getPoints() + 0);
        student.setMoralEndurance(student.getMoralEndurance() + 10);
        student.setCash(student.getCash() - 10);
        Manager.getInstance().saveData(student);
        System.out.println(Student.getInstance().toString());
        System.out.println("Eat Shawarma");
    }
}

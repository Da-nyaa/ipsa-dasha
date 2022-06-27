package com.example.oop.command.comands;

import com.example.oop.command.Command;
import com.example.oop.manager.Manager;
import com.example.oop.model.Student;

public class EPAM implements Command {
    @Override
    public void execute() {
        Manager manager = Manager.getInstance();
        Student student = Student.getInstance();
        student.setPoints(student.getPoints() + manager.getRandomNumber(30, 50));
        student.setMoralEndurance(student.getMoralEndurance() - manager.getRandomNumber(10, 15));
        manager.saveData(student);
        System.out.println(Student.getInstance().toString());
        System.out.println("Epam");
    }
}

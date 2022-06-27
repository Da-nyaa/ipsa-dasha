package com.example.oop.command.comands;

import com.example.oop.command.Command;
import com.example.oop.manager.Manager;
import com.example.oop.model.Student;

public class Work implements Command {
    @Override
    public void execute() {
        Manager manager = Manager.getInstance();
        Student student = Student.getInstance();
        student.setPoints(student.getPoints() - manager.getRandomNumber(2, 5));
        student.setMoralEndurance(student.getMoralEndurance() - manager.getRandomNumber(20, 30));
        student.setCash(student.getCash() + manager.getRandomNumber(0, 100));
        manager.saveData(student);
        System.out.println(Student.getInstance().toString());
        System.out.println("Work done");
    }
}

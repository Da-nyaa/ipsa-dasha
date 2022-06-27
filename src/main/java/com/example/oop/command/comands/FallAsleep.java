package com.example.oop.command.comands;

import com.example.oop.command.Command;
import com.example.oop.manager.Manager;
import com.example.oop.model.Student;

public class FallAsleep implements Command {
    @Override
    public void execute() {
        Manager manager = Manager.getInstance();
        Student student = Student.getInstance();
        student.setPoints(student.getPoints() + 0);
        student.setMoralEndurance(student.getMoralEndurance() + manager.getRandomNumber(3, 8));
        student.setCash(student.getCash() - manager.getRandomNumber(0, 5));
        manager.saveData(student);
        System.out.println(Student.getInstance().toString());
        System.out.println("asleep");
    }
}

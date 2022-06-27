package com.example.oop.command.comands;

import com.example.oop.command.Command;
import com.example.oop.manager.Manager;
import com.example.oop.model.Student;

public class MakeOrder implements Command {
    @Override
    public void execute() {
        Manager manager = Manager.getInstance();
        Student student = Student.getInstance();
        student.setCash(student.getCash() + manager.getRandomNumber(7, 12));
        student.setPoints(student.getPoints() - manager.getRandomNumber(1, 8));
        student.setMoralEndurance(student.getMoralEndurance() + manager.getRandomNumber(11, 18));
        manager.saveData(student);
        System.out.println(Student.getInstance().toString());
        System.out.println("Make order");
    }
}

package com.example.oop.command.comands;

import com.example.oop.command.Command;
import com.example.oop.manager.Manager;
import com.example.oop.model.Student;

public class MakeOrder implements Command {
    @Override
    public void execute() {
        Student student = Student.getInstance();
        student.setCash(student.getCash() + 10);
        student.setPoints(student.getPoints() - 5);
        student.setMoralEndurance(student.getMoralEndurance() + 15);
        Manager.getInstance().saveData(student);
        System.out.println(Student.getInstance().toString());
        System.out.println("Order makead");
    }
}

package com.example.oop.command.comands;

import com.example.oop.Main;
import com.example.oop.command.Command;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lose implements Command {
    @Override
    public void execute() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("lose-page.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 450);
            Stage anotherStage = new Stage();
            anotherStage.setTitle("Another Window Triggered by Clicking");
            anotherStage.setScene(scene);
            anotherStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

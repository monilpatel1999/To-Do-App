package ucf.assignments;

public class TodoLists {
    package ucf.assignments;
    /*
     *  UCF COP3330 Summer 2021 Assignment 4 Solution
     *  Copyright 2021 Monil_Patel
     */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

    public class TodoLists extends Application {

        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage primaryStage) throws Exception
        {
            Parent root = FXMLLoader.load(getClass().getResource("TodoGUI.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setTitle("To-Do List Application");
            primaryStage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }
}

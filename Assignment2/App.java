package Assignment2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        
    }

    public void start(Stage primaryStage) {
        AdminPanel admin = AdminPanel.getInstance();
        admin.setVisible(true);
    }
}

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


//    public static Memory memory = new Memory();
    public static CPU cpu;
    public static cache myCache;

    public static void main(String[] args) {
        cpu = new CPU();
        myCache = new cache();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Project Part-One");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }
}

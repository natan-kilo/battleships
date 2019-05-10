package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage mainStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("scenes/username/username.fxml"));
        mainStage.setTitle("Hello World");
        mainStage.setScene(new Scene(root, 600, 400));
        root.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        mainStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}

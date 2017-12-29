package box;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage stage) throws Exception{

        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("Menu.fxml"));
        stage.setTitle("Моя записная книжка");
        stage.setScene(new Scene(root, 215,196));

        stage.show();


    }


    public static void main (String[] args) {

        launch(args);

    }}

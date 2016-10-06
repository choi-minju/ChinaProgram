package v1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SplashMain extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.initStyle(StageStyle.UNDECORATED);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/SplashMain.fxml"));
        Parent root = loader.load();

        stage.setScene(new Scene(root));
        stage.setResizable(false);

        stage.show();
    } // start

    public static void main(String[] args) {
        launch(args);
    } // main
} // class

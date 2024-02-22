import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;

public class AppInitializer extends Application {
    public static Stage mainStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("views/LordingPageForm.fxml"))));
        primaryStage.setTitle("Farm system v.1.0  ");
        primaryStage.centerOnScreen();
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setFullScreen(false);
        primaryStage.setResizable(false);
        primaryStage.show();

        Parent loginRoot = FXMLLoader.load(getClass().getResource("views/LoginForm.fxml"));
        Stage logStage = new Stage();
        logStage.setFullScreen(false);
        logStage.setResizable(true);
        logStage.setScene(new Scene(loginRoot, 1060, 600));
        this.mainStage = logStage;

        PauseTransition delay = new PauseTransition(Duration.seconds(6));
        delay.setOnFinished(event -> primaryStage.close());
        delay.play();
        PauseTransition delayLog = new PauseTransition(Duration.seconds(6));
        delayLog.setOnFinished(event -> logStage.show());
        delayLog.play();
        }
}
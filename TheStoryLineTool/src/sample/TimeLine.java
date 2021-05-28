package sample;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class TimeLine extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane canvas = new Pane();
        Scene scene = new Scene(canvas, 800, 200);


        primaryStage.setTitle("TimeLine");
        primaryStage.setScene(scene);
        primaryStage.show();



        Timeline timelineOpacity = new Timeline();
        timelineOpacity.setCycleCount(20);
        timelineOpacity.play();
    }
}

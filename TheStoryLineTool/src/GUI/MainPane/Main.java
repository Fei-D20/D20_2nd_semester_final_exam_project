package GUI.MainPane;

import GUI.Node.Node_EventCard;
import application.controller.Controller_addEventCard;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;


/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-25-00.57
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage){
        AnchorPane_Root anchorPane_root = new AnchorPane_Root();
        AnchorPane root = anchorPane_root.getRoot();

        // basic scene and primaryStage
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("The Story Line Tool");
        primaryStage.setHeight(768);
        primaryStage.setWidth(1366);
        primaryStage.show();

        // after primaryStage showing on, we can set the menubar following the scene size
        anchorPane_root.anchorPane_menuBar.menuBar_Menu.setPrefWidth(root.getWidth());
        root.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                anchorPane_root.anchorPane_menuBar.menuBar_Menu.setPrefWidth(newValue.doubleValue());
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}

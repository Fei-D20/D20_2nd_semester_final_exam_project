package GUI.MainPane;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
        AnP_Root _rootAnP = new AnP_Root();
        AnchorPane root = _rootAnP.getRoot();

        // basic scene and primaryStage
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("The Story Line Tool");
        primaryStage.setHeight(768);
        primaryStage.setWidth(1366);
        primaryStage.show();

        // after primaryStage showing on, we can set the menubar following the scene size
        _rootAnP.anP_menuBar.menuBar_Menu.setPrefWidth(root.getWidth());
        root.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                _rootAnP.anP_menuBar.menuBar_Menu.setPrefWidth(newValue.doubleValue());
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}

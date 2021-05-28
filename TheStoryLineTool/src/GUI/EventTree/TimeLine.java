package GUI.EventTree;


import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-25-23.07
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class TimeLine {

    public AnchorPane  AncPane_Timeline;
    public AnchorPane getAncPane_Timeline(){

        Label lable_timeLine = new Label("Time Line");
        lable_timeLine.setPrefSize(100,50);
        lable_timeLine.setStyle("-fx-background-color: lightgray;" +
                "-fx-font-weight: bold;" +
                "-fx-font-size: 16");
        HBox HBox_Timeline = new HBox(lable_timeLine);
        HBox_Timeline.setMargin(lable_timeLine,new Insets(0,0,2,0));
        AnchorPane anchorPane = new AnchorPane(HBox_Timeline);

        return anchorPane;
    }
}

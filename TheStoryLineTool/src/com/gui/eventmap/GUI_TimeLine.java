package com.gui.eventmap;

import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-08-09.20
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class GUI_TimeLine {
    public AnchorPane showTimeLine(){
        Label lb_TimeLine = new Label("Time Line : ");
        lb_TimeLine.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;" + "-fx-background-color: lightgray;");
        lb_TimeLine.setPrefHeight(1);
        lb_TimeLine.setPrefWidth(2000);
        lb_TimeLine.setPadding(new Insets(1));

        Canvas can_TimeLine = new Canvas();
        can_TimeLine.setStyle("-fx-background-color: white");

        VBox vb_TimeLine = new VBox();
        vb_TimeLine.setPrefHeight(100); // this is decide the time line height
        vb_TimeLine.setPrefWidth(2000);
        vb_TimeLine.getChildren().addAll(lb_TimeLine, can_TimeLine);
        vb_TimeLine.setStyle("-fx-background-color: gray");

        AnchorPane anP_TimeLine = new AnchorPane(vb_TimeLine);
        AnchorPane.setLeftAnchor(vb_TimeLine, 1.0);
        AnchorPane.setRightAnchor(vb_TimeLine, 1.0);
        AnchorPane.setTopAnchor(vb_TimeLine, 1.0);
        AnchorPane.setBottomAnchor(vb_TimeLine, 1.0);
        anP_TimeLine.setStyle("-fx-background-color: lightgray");

        return anP_TimeLine;
    }
}

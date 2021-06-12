package com.gui.eventmap;

import com.application.opreation.story.App_Opr_View;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
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
public class GUI_View {
    private Button bu_Export;

    public AnchorPane showView(){
        Label lb_View = new Label("View : ");
        lb_View.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;" + "-fx-background-color: lightgray;");
        lb_View.setPrefHeight(1);
        lb_View.setPrefWidth(2000);
        lb_View.setPadding(new Insets(1));

        TextArea ta_View = new TextArea();

        ButtonBar bb_View = new ButtonBar();
        bu_Export = new Button("Export to file");
        bb_View.getButtons().add(bu_Export);


        VBox vb_View = new VBox();
        vb_View.setPrefHeight(200);
        vb_View.setPrefWidth(2000);
        vb_View.getChildren().addAll(lb_View,ta_View,bb_View);
        vb_View.setStyle("-fx-background-color: gray");

        AnchorPane anP_View = new AnchorPane(vb_View);
        AnchorPane.setLeftAnchor(vb_View, 1.0);
        AnchorPane.setRightAnchor(vb_View, 1.0);
        AnchorPane.setTopAnchor(vb_View, 1.0);
        AnchorPane.setBottomAnchor(vb_View, 1.0);
        anP_View.setStyle("-fx-background-color: lightgray");

        return anP_View;
    }

    public Button getBu_Export() {

        return bu_Export;
    }

    public void setBu_Export(Button bu_Export) {
        this.bu_Export = bu_Export;
    }
}

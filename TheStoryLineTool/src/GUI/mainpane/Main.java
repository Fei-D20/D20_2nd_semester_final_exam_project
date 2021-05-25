package GUI.mainpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.control.TreeView;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


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

        // This is the menu bar and quick start bar
        Button button_File = new Button("File");
        Button button_Edit = new Button("Edit");
        Button button_help = new Button("Help");
        HBox hBox_MenuBar = new HBox(button_File,button_Edit,button_help);

        Button button_New = new Button("New");
        Button button_Delete = new Button("Delete");
        HBox hBox_QuickStart = new HBox(button_New, button_Delete);

        VBox vBoxControlArea = new VBox(hBox_MenuBar,hBox_QuickStart);
        vBoxControlArea.setSpacing(3);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().add(vBoxControlArea);
        anchorPane.setPrefHeight(60);
        AnchorPane.setTopAnchor(vBoxControlArea,0.0);
        AnchorPane.setLeftAnchor(vBoxControlArea,0.0);
        AnchorPane.setRightAnchor(vBoxControlArea,10.0);
        AnchorPane.setBottomAnchor(vBoxControlArea,0.0);

        anchorPane.setStyle("-fx-background-color: lightgray;");

        /* This is the mean edit area for relationship. and after the user click one event card
         * then it will change to the single event card edit.
         */
        Canvas canvas_RelationArea = new Canvas();


        Canvas canvas_TimeLineArea = new Canvas();

        VBox vBoxEditArea = new VBox(canvas_RelationArea,canvas_TimeLineArea);
        vBoxEditArea.setPrefHeight(800);
        vBoxEditArea.setPrefWidth(800);

        TreeView<String> stringTreeView_EventCardTree = new TreeView<>();
        stringTreeView_EventCardTree.setPrefHeight(800);
        stringTreeView_EventCardTree.setPrefWidth(200);
        stringTreeView_EventCardTree.setTooltip(new Tooltip("event card tree"));
        stringTreeView_EventCardTree.setOpacity(0.5);

        TilePane tilePane_EventCardList = new TilePane();
        tilePane_EventCardList.setPrefHeight(800);
        tilePane_EventCardList.setPrefWidth(200);
        tilePane_EventCardList.getChildren().add(new Label("eventcardlist"));
        tilePane_EventCardList.setStyle("-fx-background-color: lightgray");

        BorderPane borderPane = new BorderPane();

        borderPane.setTop(anchorPane);
        borderPane.setCenter(vBoxEditArea);
        borderPane.setLeft(stringTreeView_EventCardTree);
        borderPane.setRight(tilePane_EventCardList);
        borderPane.setStyle("-fx-background-color: gray");

        BorderPane.setMargin(anchorPane,new Insets(2.5));
        BorderPane.setMargin(stringTreeView_EventCardTree,new Insets(2.5));
        BorderPane.setMargin(tilePane_EventCardList,new Insets(2.5));

        // 锚点布局设置
        AnchorPane root = new AnchorPane();
        root.getChildren().add(borderPane);
        root.setPadding(new Insets(10));
        AnchorPane.setTopAnchor(borderPane,0.0);
        AnchorPane.setLeftAnchor(borderPane,0.0);
        AnchorPane.setBottomAnchor(borderPane,0.0);
        AnchorPane.setRightAnchor(borderPane,0.0);


        // 基本的舞台设置
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("The Story Line Tool");
        primaryStage.setHeight(768);
        primaryStage.setWidth(1366);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

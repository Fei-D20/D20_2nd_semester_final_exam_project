package GUI.mainpane;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.*;
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

        // This is the menu bar with the list of menu
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu view = new Menu("View");
        Menu help = new Menu("Help");
        MenuBar menuBar_Menu = new MenuBar(file,edit,view,help);

        MenuItem menuItem_New = new MenuItem("New");
        MenuItem menuItem_Delete = new MenuItem("Delete");
        file.getItems().addAll(menuItem_New,menuItem_Delete);

        // here is the quick start icon
        Button button_New = new Button("New( it will be icon )");
        Button button_Delete = new Button("Delete( it will be icon )");
        HBox hBox_QuickStart = new HBox(button_New, button_Delete);

        // here add the menubar and quickstart on a vbox and set the gap of each of them
        VBox vBoxControlArea = new VBox(menuBar_Menu,hBox_QuickStart);
        vBoxControlArea.setSpacing(3);

        // add the vbox of control area on the anchorPane for let it fit with the scene
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().add(vBoxControlArea);
        anchorPane.setPrefHeight(60);
        anchorPane.setStyle("-fx-background-color: lightgray;");
        AnchorPane.setTopAnchor(vBoxControlArea,0.0);
        AnchorPane.setLeftAnchor(vBoxControlArea,0.0);
        AnchorPane.setRightAnchor(vBoxControlArea,0.0);
        AnchorPane.setBottomAnchor(vBoxControlArea,0.0);

        // before here is all for the top side of borderPane



        /* This is the mean edit area for relationship. and after the user click one event card
         * then it will change to the single event card edit.
         */
        Canvas canvas_RelationArea = new Canvas();

        Canvas canvas_TimeLineArea = new Canvas();

        // set the tow canvas on the vbox
        VBox vBoxEditArea = new VBox(canvas_RelationArea,canvas_TimeLineArea);
        vBoxEditArea.setPrefHeight(800);
        vBoxEditArea.setPrefWidth(800);

        // before here is all for the middle of borderPane



        TreeView<String> stringTreeView_EventCardTree = new TreeView<>();
        stringTreeView_EventCardTree.setPrefHeight(800);
        stringTreeView_EventCardTree.setPrefWidth(200);
        stringTreeView_EventCardTree.setTooltip(new Tooltip("event card tree"));
        stringTreeView_EventCardTree.setOpacity(0.5);

        // before here is all for the left side of borderPane


        TilePane tilePane_EventCardList = new TilePane();
        tilePane_EventCardList.setPrefHeight(800);
        tilePane_EventCardList.setPrefWidth(200);
        tilePane_EventCardList.setStyle("-fx-background-color: lightgray");

        Label lable_eventCardList = new Label("Event Card List");
        lable_eventCardList.setPrefSize(200,50);
        lable_eventCardList.setStyle("-fx-background-color: lightgray;" +
                "-fx-font-weight: bold;" +
                "-fx-font-size: 16");
        VBox vBox_EventCardList = new VBox(lable_eventCardList, tilePane_EventCardList);
        VBox.setMargin(lable_eventCardList,new Insets(0,0,1,0));

        // before here is all for the right side of borderPane



        // So now we can set the four part on the borderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(anchorPane);
        borderPane.setCenter(vBoxEditArea);
        borderPane.setLeft(stringTreeView_EventCardTree);
        borderPane.setRight(vBox_EventCardList);
        borderPane.setStyle("-fx-background-color: gray");

        BorderPane.setMargin(anchorPane,new Insets(1));
        BorderPane.setMargin(stringTreeView_EventCardTree,new Insets(1));
        BorderPane.setMargin(vBox_EventCardList,new Insets(1));

        // this is behind of borderpane for set the margin for the scene
        AnchorPane root = new AnchorPane();
        root.getChildren().add(borderPane);
        root.setPadding(new Insets(5));
        AnchorPane.setTopAnchor(borderPane,0.0);
        AnchorPane.setLeftAnchor(borderPane,0.0);
        AnchorPane.setBottomAnchor(borderPane,0.0);
        AnchorPane.setRightAnchor(borderPane,0.0);


        // basic scene and primaryStage
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("The Story Line Tool");
        primaryStage.setHeight(768);
        primaryStage.setWidth(1366);
        primaryStage.show();

        // after primaryStage showing on, we can set the menubar following the scene size
        menuBar_Menu.setPrefWidth(anchorPane.getWidth());
        anchorPane.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                menuBar_Menu.setPrefWidth(newValue.doubleValue());
            }
        });


        menuItem_New.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Node_EventCard node_eventCard = new Node_EventCard();
                Node eventCard = node_eventCard.getEventCard();
                tilePane_EventCardList.getChildren().add(eventCard);
                TilePane.setMargin(eventCard,new Insets(1));

            }
        });
        button_New.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Node_EventCard node_eventCard = new Node_EventCard();
                Node eventCard = node_eventCard.getEventCard();
                tilePane_EventCardList.getChildren().add(eventCard);
                TilePane.setMargin(eventCard,new Insets(1));

            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}

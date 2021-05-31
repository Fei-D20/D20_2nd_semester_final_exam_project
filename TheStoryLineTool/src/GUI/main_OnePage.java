package GUI;


import application.opration.edit.Edit_InputLimit;
import application.opration.mouse.Opr_Editable_DoubleClick;
import domain.eventcard.Dom_EventCard;
import domain.story.Dom_EventList;
import domain.user.Dom_Author;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-31-01.20
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class main_OnePage extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        // *************** Controller Bar ******************
        Button bu_New = new Button("+");
        bu_New.setPrefWidth(5.0);
        bu_New.setPrefHeight(5.0);

        Button bu_Delete = new Button("-");

        // here is the quick start icon
        ButtonBar bb_quickStart = new ButtonBar();
        bb_quickStart.getButtons().addAll(bu_New,bu_Delete);
        ButtonBar.setButtonUniformSize(bu_New,true);

        MenuItem mi_New = new MenuItem("New");
        MenuItem mi_Delete = new MenuItem("Delete");
        Menu menu_file = new Menu("File");
        menu_file.getItems().addAll(mi_New,mi_Delete);

        Menu menu_edit = new Menu("Edit");
        Menu menu_view = new Menu("View");
        Menu menu_help = new Menu("Help");

        MenuBar mb_MainMenu = new MenuBar();
        mb_MainMenu.getMenus().addAll(menu_file,menu_edit,menu_view,menu_help);


        VBox vb_ControlBar = new VBox(mb_MainMenu);
        vb_ControlBar.setSpacing(3);

        AnchorPane anP_ControlBar = new AnchorPane();
        anP_ControlBar.getChildren().add(vb_ControlBar);
        anP_ControlBar.setPrefHeight(60);
        anP_ControlBar.setStyle("-fx-background-color: lightgray;");
        AnchorPane.setTopAnchor(vb_ControlBar,0.0);
        AnchorPane.setLeftAnchor(vb_ControlBar,0.0);
        AnchorPane.setRightAnchor(vb_ControlBar,0.0);
        AnchorPane.setBottomAnchor(vb_ControlBar,0.0);

        // ************************ Event Card ******************************

        Label lb_EventCardTitle = new Label("Event Card : ");
        lb_EventCardTitle.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;");

        Label lb_EventTitleEventNumber = new Label("Event Number : ");
        TextField tf_EventTitleEventNumber = new TextField("event number");
        tf_EventTitleEventNumber.setOnMouseClicked(new Opr_Editable_DoubleClick());
        tf_EventTitleEventNumber.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 10;");

        Label lb_EventTitleAuthor = new Label("Author : ");
        TextField tf_EventTitleAuthor = new TextField("author");
        tf_EventTitleAuthor.setOnMouseClicked(new Opr_Editable_DoubleClick());
        tf_EventTitleAuthor.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 10;");

        Label lb_EventTitleDate = new Label("Date : ");
        TextField tf_EventTitleDate = new TextField("date");
        tf_EventTitleDate.setOnMouseClicked(new Opr_Editable_DoubleClick());
        tf_EventTitleDate.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 10;");


        TilePane tp_EventTitle = new TilePane();
        tp_EventTitle.getChildren().addAll(
                lb_EventTitleAuthor, tf_EventTitleAuthor,
                lb_EventTitleDate, tf_EventTitleDate,
                lb_EventTitleEventNumber, tf_EventTitleEventNumber);
        tp_EventTitle.setStyle("-fx-background-color: lightgray");
        tp_EventTitle.setPrefTileHeight(20);
        tp_EventTitle.setPrefTileWidth(120);

        VBox vb_EventTitle = new VBox();
        vb_EventTitle.getChildren().addAll(lb_EventCardTitle,tp_EventTitle);


        // ****************** Event ******************

        Label lb_Event = new Label("Event : ");
        lb_Event.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;" + "-fx-background-color: darkgray");
        lb_Event.setPrefHeight(1);
        lb_Event.setPadding(new Insets(1));

        Label lb_EventChapter = new Label("Chapter : ");
        Label lb_EventRole = new Label("Role : ");
        Label lb_EventTime = new Label("Time : ");

        TextArea ta_EventValue = new TextArea();
        ta_EventValue.setPrefHeight(30);
        ta_EventValue.setWrapText(true);
        ta_EventValue.setEditable(false);
        ta_EventValue.setOnMouseClicked(new Opr_Editable_DoubleClick());
        ta_EventValue.textProperty().addListener(new Edit_InputLimit(120,ta_EventValue));
        ta_EventValue.setPromptText("Please input in 120 word ");

        VBox vb_Event = new VBox(10);
        vb_Event.getChildren().addAll(lb_EventChapter,lb_EventRole,lb_EventTime,ta_EventValue);
        vb_Event.setStyle("-fx-background-color: lightgray");

        //******* Note *********

        Label lb_Note = new Label("Note : ");
        lb_Note.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;" + "-fx-background-color: darkgray;");
        lb_Note.setPrefHeight(1);
        lb_Note.setPadding(new Insets(1));

        TextArea ta_NoteValue = new TextArea();
        ta_NoteValue.setPrefHeight(250);
        ta_NoteValue.setWrapText(true);
        ta_NoteValue.setEditable(false);
        ta_NoteValue.setOnMouseClicked(new Opr_Editable_DoubleClick());
        ta_NoteValue.textProperty().addListener(new Edit_InputLimit(2000,ta_NoteValue));
        ta_NoteValue.setPromptText("Please input in 2000 word");

        VBox vb_Note = new VBox(10);
        vb_Note.getChildren().addAll(lb_Note,ta_NoteValue);
        vb_Note.setStyle("-fx-background-color: lightgray");

        // ****** Comment ********
        Label lb_Comment = new Label("Comment : ");
        lb_Comment.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;" + "-fx-background-color: darkgray;");
        lb_Comment.setPrefHeight(1);
        lb_Comment.setPrefWidth(500);
        lb_Comment.setPadding(new Insets(1));

        Label lb_CommentAuthor = new Label("Author : ");
        Label lb_CommentDate = new Label("Date : ");
        TextArea ta_CommentValue = new TextArea();
        ta_CommentValue.setPrefHeight(250);
        ta_CommentValue.setWrapText(true);
        ta_CommentValue.setEditable(false);
        ta_CommentValue.setOnMouseClicked(new Opr_Editable_DoubleClick());
        ta_CommentValue.setPromptText("Please input in 2000 word");
        ta_CommentValue.textProperty().addListener(new Edit_InputLimit(2000,ta_CommentValue));
        ta_CommentValue.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println(newValue);
            }
        });

        VBox vb_Comment = new VBox(10);
        vb_Comment.getChildren().addAll(lb_Comment,lb_CommentAuthor,lb_CommentDate,ta_CommentValue);
        vb_Comment.setStyle("-fx-background-color: lightgray");

        VBox vb_EventCard = new VBox();
        vb_EventCard.setStyle("-fx-background-color: darkgray");
        vb_EventCard.setPrefWidth(500); // this is decide the event card weight
        vb_EventCard.getChildren().addAll(vb_EventTitle, vb_Event, vb_Note, vb_Comment);

        AnchorPane anP_EventCard = new AnchorPane(vb_EventCard);
        AnchorPane.setLeftAnchor(vb_EventCard,1.0);
        AnchorPane.setRightAnchor(vb_EventCard,1.0);
        AnchorPane.setTopAnchor(vb_EventCard,1.0);
        AnchorPane.setBottomAnchor(vb_EventCard,1.0);
        anP_EventCard.setStyle("-fx-background-color: lightgray");

        // ****************************** Event List *****************************

        Label lb_EventList = new Label("Event List : ");

        lb_EventList.setStyle("-fx-font-weight: bold;" +
                "-fx-font-size: 16;");
        lb_EventList.setPrefHeight(1);
        lb_EventList.setPadding(new Insets(1));


        ListView<Dom_EventCard> lv_EventList
                = new ListView<Dom_EventCard>(FXCollections.observableArrayList(Dom_EventList.getInstance()));

        lv_EventList.setPlaceholder(new Label("Event Card List"));
        lv_EventList.setPrefHeight(700);
        lv_EventList.setPrefWidth(200);
        lv_EventList.setOpacity(0.5);
        lv_EventList.setStyle("-fx-text-fill: blue;" +
                "-fx-font-size: 16;" +
                "-fx-font-weight: bold" );

        lv_EventList.setEditable(true);
        lv_EventList.setCellFactory(TextFieldListCell.forListView(new StringConverter<Dom_EventCard>() {
            @Override
            public String toString(Dom_EventCard object) {
                String s = object.getAuthorID() + " : " + object.getEditDate() + object.getAuthorID();
                return s;
            }

            @Override
            public Dom_EventCard fromString(String string) {
                return null;
            }
        }));


        ButtonBar bb_EventList = new ButtonBar();
        Button bu_EventList_Add = new Button("Add");
        bb_EventList.getButtons().add(bu_EventList_Add);

        // *
        Dom_Author fei = new Dom_Author("fei" , 001, 123);
        // *
        bu_EventList_Add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // create the domain object
                Dom_EventCard newEventCard = new Dom_EventCard(fei.getAuthorID());

                // put it into event list
                Dom_EventList.getInstance().add(newEventCard);

                // put it into the event list showing.
                lv_EventList.getItems().add(newEventCard);
            }
        });

        VBox vb_EventList = new VBox();
        vb_EventList.setPrefWidth(200); // this is decide the event card weight
        vb_EventList.getChildren().addAll(lb_EventList,lv_EventList,bb_EventList);
        vb_EventList.setStyle("-fx-background-color: darkgray");

        AnchorPane anP_EventList = new AnchorPane(vb_EventList);
        AnchorPane.setLeftAnchor(vb_EventList,1.0);
        AnchorPane.setRightAnchor(vb_EventList,1.0);
        AnchorPane.setTopAnchor(vb_EventList,1.0);
        AnchorPane.setBottomAnchor(vb_EventList,1.0);
        anP_EventList.setStyle("-fx-background-color: lightgray");

        // ********************* Event Map **********************************

        Label lb_EventMap = new Label("Event Map : ");
        lb_EventMap.setStyle("-fx-font-weight: bold;" +
                "-fx-font-size: 16;" +
                "-fx-background-color: lightgray;");
        lb_EventMap.setPrefHeight(1);
        lb_EventMap.setPrefWidth(800);
        lb_EventMap.setPadding(new Insets(1));

        Canvas can_EventMap = new Canvas();
        can_EventMap.setStyle("-fx-background-color: white");

        VBox vb_EventMap = new VBox();
        vb_EventMap.setPrefWidth(800); // this is decide the event card weight
        vb_EventMap.getChildren().addAll(lb_EventMap,can_EventMap);
        vb_EventMap.setStyle("-fx-background-color: gray");

        AnchorPane anP_EventMap = new AnchorPane(vb_EventMap);
        AnchorPane.setLeftAnchor(vb_EventMap,1.0);
        AnchorPane.setRightAnchor(vb_EventMap,1.0);
        AnchorPane.setTopAnchor(vb_EventMap,1.0);
        AnchorPane.setBottomAnchor(vb_EventMap,1.0);
        anP_EventMap.setStyle("-fx-background-color: lightgray");


        // *********************** Time Line **************************

        Label lb_TimeLine = new Label("Time Line : ");
        lb_TimeLine.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;" + "-fx-background-color: lightgray;");
        lb_TimeLine.setPrefHeight(1);
        lb_TimeLine.setPrefWidth(2000);
        lb_TimeLine.setPadding(new Insets(1));

        Canvas can_TimeLine = new Canvas();
        can_TimeLine.setStyle("-fx-background-color: white");

        VBox vb_TimeLine = new VBox();
        vb_TimeLine.setPrefHeight(120); // this is decide the time line height
        vb_TimeLine.setPrefWidth(2000);
        vb_TimeLine.getChildren().addAll(lb_TimeLine,can_TimeLine);
        vb_TimeLine.setStyle("-fx-background-color: gray");

        AnchorPane anP_TimeLine = new AnchorPane(vb_TimeLine);
        AnchorPane.setLeftAnchor(vb_TimeLine,1.0);
        AnchorPane.setRightAnchor(vb_TimeLine,1.0);
        AnchorPane.setTopAnchor(vb_TimeLine,1.0);
        AnchorPane.setBottomAnchor(vb_TimeLine,1.0);
        anP_TimeLine.setStyle("-fx-background-color: lightgray");



        // *********************** Root *********************

        BorderPane bp_Root = new BorderPane();
        bp_Root.setTop(anP_ControlBar);
        bp_Root.setCenter(anP_EventMap);
        bp_Root.setLeft(anP_EventList);
        bp_Root.setBottom(anP_TimeLine);
        bp_Root.setStyle("-fx-background-color: gray");
        bp_Root.setRight(anP_EventCard);

        BorderPane.setMargin(anP_EventCard,new Insets(1));
        BorderPane.setMargin(anP_ControlBar,new Insets(1));
        BorderPane.setMargin(anP_EventList,new Insets(1));
        BorderPane.setMargin(anP_EventMap,new Insets(1));
        BorderPane.setMargin(anP_TimeLine,new Insets(1));

        // this is behind of borderpane for set the margin for the scene

        AnchorPane anp_Root = new AnchorPane();
        anp_Root.getChildren().add(bp_Root);
        anp_Root.setPadding(new Insets(5));
        AnchorPane.setTopAnchor(bp_Root,0.0);
        AnchorPane.setLeftAnchor(bp_Root,0.0);
        AnchorPane.setBottomAnchor(bp_Root,0.0);
        AnchorPane.setRightAnchor(bp_Root,0.0);


        Scene scene = new Scene(anp_Root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("The Story Line Tool");
        primaryStage.setHeight(768);
        primaryStage.setWidth(1366);
        primaryStage.show();

    }
}

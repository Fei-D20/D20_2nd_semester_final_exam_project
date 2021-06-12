package com.gui.eventcard;

import com.application.control.edit.Con_Edit_InputLimit;
import com.application.control.mouse.Con_Editable_DoubleClick;
import com.application.opreation.eventcard.App_Opr_ModifyText;
import com.domain.eventcard.Dom_EventCard;
import com.function.eventCard.Func_Comment;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-08-09.08
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class GUI_Comment {
    TextField tf_CommentAuthor;
    TextField tf_CommentDate;
    TextArea ta_CommentValue;

    public VBox showComment(){
        Label lb_Comment = new Label("Comment : ");
        lb_Comment.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;" + "-fx-background-color: darkgray;");
        lb_Comment.setPadding(new Insets(1));

        Label lb_CommentAuthor = new Label("Author : ");
        tf_CommentAuthor = new TextField();
        tf_CommentAuthor.setOnMouseClicked(new Con_Editable_DoubleClick());
        tf_CommentAuthor.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 10;");
        tf_CommentAuthor.textProperty().addListener(new App_Opr_ModifyText(){
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

                ListView<Dom_EventCard> lv_eventList = getLv_EventList();
                Dom_EventCard selectedItem = lv_eventList.getSelectionModel().getSelectedItem();
                selectedItem.getDom_comment().setCommentAuthor(newValue);

                Func_Comment func_comment = new Func_Comment();
                func_comment.modify(selectedItem.getDom_comment());

                lv_eventList.refresh();
            }
        });

        Label lb_CommentDate = new Label("Date : ");
        tf_CommentDate = new TextField();
        tf_CommentDate.setOnMouseClicked(new Con_Editable_DoubleClick());
        tf_CommentDate.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 10;");

        ta_CommentValue = new TextArea();
        ta_CommentValue.setPrefHeight(250);
        ta_CommentValue.setWrapText(true);
        ta_CommentValue.setEditable(false);
        ta_CommentValue.setOnMouseClicked(new Con_Editable_DoubleClick());
        ta_CommentValue.setPromptText("event comment : max 2000 word");
        ta_CommentValue.textProperty().addListener(new Con_Edit_InputLimit(2000, ta_CommentValue));
        ta_CommentValue.textProperty().addListener(new App_Opr_ModifyText(){
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

                ListView<Dom_EventCard> lv_eventList = getLv_EventList();
                Dom_EventCard selectedItem = lv_eventList.getSelectionModel().getSelectedItem();
                selectedItem.getDom_comment().setCommentText(newValue);

                Func_Comment func_comment = new Func_Comment();
                func_comment.modify(selectedItem.getDom_comment());

                lv_eventList.refresh();
            }
        });

        TilePane tp_EventComment = new TilePane();
        tp_EventComment.getChildren().addAll(
                lb_CommentAuthor,tf_CommentAuthor,
                lb_CommentDate,tf_CommentDate
        );
        tp_EventComment.setStyle("-fx-background-color: lightgray");
        tp_EventComment.setPrefTileHeight(20);
        tp_EventComment.setPrefTileWidth(120);

        VBox vb_Comment = new VBox(2);
        vb_Comment.getChildren().addAll(lb_Comment,tp_EventComment, ta_CommentValue);
        vb_Comment.setStyle("-fx-background-color: lightgray");

        return vb_Comment;
    }

    public TextField getTf_CommentAuthor() {
        return tf_CommentAuthor;
    }

    public void setTf_CommentAuthor(TextField tf_CommentAuthor) {
        this.tf_CommentAuthor = tf_CommentAuthor;
    }

    public TextField getTf_CommentDate() {
        return tf_CommentDate;
    }

    public void setTf_CommentDate(TextField tf_CommentDate) {
        this.tf_CommentDate = tf_CommentDate;
    }

    public TextArea getTa_CommentValue() {
        return ta_CommentValue;
    }

    public void setTa_CommentValue(TextArea ta_CommentValue) {
        this.ta_CommentValue = ta_CommentValue;
    }
}

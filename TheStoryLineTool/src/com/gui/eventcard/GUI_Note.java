package com.gui.eventcard;

import com.application.control.edit.Con_Edit_InputLimit;
import com.application.control.mouse.Con_Editable_DoubleClick;
import com.application.opreation.eventcard.App_Opr_ModifyText;
import com.domain.eventcard.Dom_EventCard;
import com.function.eventCard.Func_Note;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-08-09.05
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class GUI_Note {
    private TextArea ta_NoteValue;

    public VBox showNote(){
        Label lb_Note = new Label("Note : ");
        lb_Note.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;" + "-fx-background-color: darkgray;");
        lb_Note.setPadding(new Insets(1));

        ta_NoteValue = new TextArea();
        ta_NoteValue.setPrefHeight(250);
        ta_NoteValue.setWrapText(true);
        ta_NoteValue.setEditable(false);
        ta_NoteValue.setOnMouseClicked(new Con_Editable_DoubleClick());
        ta_NoteValue.textProperty().addListener(new Con_Edit_InputLimit(2000, ta_NoteValue));
        ta_NoteValue.setPromptText("event description : max 2000 words ");
        ta_NoteValue.textProperty().addListener(new App_Opr_ModifyText(){
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

                ListView<Dom_EventCard> lv_eventList = getLv_EventList();
                Dom_EventCard selectedItem = lv_eventList.getSelectionModel().getSelectedItem();
                selectedItem.getDom_note().setNoteText(newValue);

                Func_Note func_note = new Func_Note();
                func_note.modify(selectedItem.getDom_note());

                lv_eventList.refresh();
            }
        });

        VBox vb_Note = new VBox(2);
        vb_Note.getChildren().addAll(lb_Note, ta_NoteValue);
        vb_Note.setStyle("-fx-background-color: lightgray");

        return vb_Note;
    }

    public TextArea getTa_NoteValue() {
        return ta_NoteValue;
    }

    public void setTa_NoteValue(TextArea ta_NoteValue) {
        this.ta_NoteValue = ta_NoteValue;
    }
}

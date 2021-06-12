package com.application.opreation.story;

import com.domain.eventcard.Dom_EventCard;
import com.sun.glass.ui.CommonDialogs;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-12-12.35
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class App_Opr_View implements EventHandler<ActionEvent> {
    private static Dom_EventCard selectedEvent;

    @Override
    public void handle(ActionEvent event) {
        Stage stage = new Stage();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Export to file");
        fileChooser.setInitialDirectory(new File(new File("TheStoryLineTool").getAbsolutePath() ));

        File file = fileChooser.showSaveDialog(stage);
        if(file == null){
            return;
        }

        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            System.out.println("export select" + selectedEvent.toString());

            String data = "Chapter " + selectedEvent.getDom_event().getChapterNo() + "\n" +
                    selectedEvent.getDom_event().getEventDate() + "\t" + selectedEvent.getDom_event().getEventName() + "\n" +
                    selectedEvent.getDom_event().getQuickNote() + "\n" +
                    selectedEvent.getDom_note();

            bufferedWriter.write(data);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bufferedWriter != null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public static Dom_EventCard getSelectedEvent() {
        return selectedEvent;
    }

    public static void setSelectedEvent(Dom_EventCard selectedEvent) {
        App_Opr_View.selectedEvent = selectedEvent;
    }
}

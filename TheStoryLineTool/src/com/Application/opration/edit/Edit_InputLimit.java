package com.Application.opration.edit;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextInputControl;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-29-16.31
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Edit_InputLimit implements ChangeListener<String> {

    private int inputLimit;
    private TextInputControl textInputControl;

    public Edit_InputLimit(int inputLimit, TextInputControl textInputControl) {
        this.inputLimit = inputLimit;
        this.textInputControl = textInputControl;
    }

    @Override
    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
        if(newValue.length() > inputLimit){
            textInputControl.setText(oldValue);
        }
    }
}

package com.Application.opration.edit;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-29-15.54
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Edit_Input implements ChangeListener<String> {
    @Override
    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
        System.out.println(newValue);
    }
}

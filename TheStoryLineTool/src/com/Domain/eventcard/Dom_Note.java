package com.Domain.eventcard;

import java.util.Objects;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-26-20.26
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Dom_Note {
    private int noteID;
    private String noteText;


    public Dom_Note() {
    }

    public Dom_Note(int noteID) {
        this.noteID = noteID;
    }

    public Dom_Note(int noteID, String noteText) {
        this.noteID = noteID;
        this.noteText = noteText;
    }

    public int getNoteID() {
        return noteID;
    }

    public void setNoteID(int noteID) {
        this.noteID = noteID;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dom_Note dom_note = (Dom_Note) o;
        return noteID == dom_note.noteID && Objects.equals(noteText, dom_note.noteText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noteID, noteText);
    }

    @Override
    public String toString() {
        return "Dom_Note{" +
                "eventID=" + noteID +
                ", noteText='" + noteText + '\'' +
                '}';
    }
}

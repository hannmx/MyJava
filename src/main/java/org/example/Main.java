package org.example;

import org.example.NoteProcess;
import org.example.Input;
import org.example.FileWriterFun;

public class Main {
    public static void main(String[] args) {
        String note = Input.getUserInput();
        String processNote = NoteProcess.processNote(note);
        FileWriterFun.writeToFile(processNote, "notes.txt");
    }
}
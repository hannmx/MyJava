package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NoteProcess {
    public static String processNote(String note) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String formatDate = dateFormat.format(new Date());
        return formatDate + " -> " + note;
    }
}

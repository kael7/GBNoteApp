package com.example.gbnoteapp;

import java.util.Date;

public class Note {
    private String note_name;
    private String note_desc;

    public Note(String note_name, String note_desc) {
        this.note_name = note_name;
        this.note_desc = note_desc;
    }

    public Note() {
        this("Note 1", "Note desc");
    }

    public String getNote_name() {
        return note_name;
    }

    public String getNote_desc() {
        return note_desc;
    }

}

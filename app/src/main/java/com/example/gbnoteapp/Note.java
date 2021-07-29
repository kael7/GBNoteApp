package com.example.gbnoteapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Note implements Parcelable {
    private int imageIndex;
    private String note_name;
//    private String note_desc;

    public Note(int imageIndex, String note_name) {
        this.imageIndex = imageIndex;
        this.note_name = note_name;
    }

    protected Note(Parcel in) {
        imageIndex = in.readInt();
        note_name = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(getImageIndex());
        dest.writeString(getNote_name());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Note> CREATOR = new Creator<Note>() {
        @Override
        public Note createFromParcel(Parcel in) {
            return new Note(in);
        }

        @Override
        public Note[] newArray(int size) {
            return new Note[size];
        }
    };

    public int getImageIndex() {
        return imageIndex;
    }

    public String getNote_name() {
        return note_name;
    }
}
